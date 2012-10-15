(ns cavemancraves.server
  (:require [noir.server :as server]
            [cronj.core :as cj])
  (:import (java.net URL)
           (java.lang StringBuilder)
           (java.io BufferedReader InputStreamReader)))

(defn fetch-url
  [address]
  (let [url (URL. address)]
    (with-open [stream (. url openStream)]
      (let [buf (BufferedReader. (InputStreamReader. stream))]
        (apply str (line-seq buf))))))

(defn prevent-dyno-idling
  []
  (cj/load-tasks!
   [{:id 1 
     :desc "Prevent dyno idling" 
     :handler (fn [job]
                (println "Preventing dyno idling")
                (fetch-url "http://cavemancraves.com")) 
     :tab "1 1,30 * * * * *"}])
  (cj/start!)
  (println "Started scheduled job for preventing dyno idling"))

(server/load-views "src/cavemancraves/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (println "Hello from Caveman Craves! Have a good and healthy day.")
    (server/start port {:mode mode
                        :ns 'cavemancraves})
    (prevent-dyno-idling)))