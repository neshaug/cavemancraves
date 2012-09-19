(ns cavemancraves.views.welcome
  (:require [cavemancraves.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to cavemancraves"]))

(defpage "/" []
  (common/layout
   (list 
    [:div.hero-unit
     [:h1 "Caveman craves!"]
     [:p "Buy awesome cookies right this moment pretty please!"]
     [:p
      [:a.btn.btn-primary.btn-large "Learn more &raquo;"]]]
    [:div.row
     [:div.span4
      [:h2 "Cookie 1"]
      [:p "Donec id elit non mi porta gravida at eget metus. Fusce dapibus,
       tellus ac cursus commodo, tortor mauris condimentum nibh, ut 
       fermentum massa justo sit amet risus. Etiam porta sem malesuada 
       magna mollis euismod. Donec sed odio dui."]
      [:p
       [:a.btn {"href" "#"} "PayPal"]
       [:a.btn {"href" "#"} "Google Checkout"]]]
     [:div.span4
      [:h2 "Cookie 2"]
      [:p "Donec id elit non mi porta gravida at eget metus. Fusce dapibus,
       tellus ac cursus commodo, tortor mauris condimentum nibh, ut 
       fermentum massa justo sit amet risus. Etiam porta sem malesuada 
       magna mollis euismod. Donec sed odio dui."]
      [:p
       [:a.btn {"href" "#"} "PayPal"]
       [:a.btn {"href" "#"} "Google Checkout"]]]
     [:div.span4
      [:h2 "Cookie 3"]
      [:p "Donec id elit non mi porta gravida at eget metus. Fusce dapibus,
       tellus ac cursus commodo, tortor mauris condimentum nibh, ut 
       fermentum massa justo sit amet risus. Etiam porta sem malesuada 
       magna mollis euismod. Donec sed odio dui."]
      [:p
       [:a.btn {"href" "#"} "PayPal"]
       [:a.btn {"href" "#"} "Google Checkout"]]]])))