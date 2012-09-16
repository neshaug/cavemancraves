(ns cavemancraves.views.welcome
  (:require [cavemancraves.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to cavemancraves"]))

(defpage "/" []
  (common/layout
   [:h1 "Welcome to my site!"]
   [:p "Hope you like it."]))