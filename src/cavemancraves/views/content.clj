(ns cavemancraves.views.content
  (:require [cavemancraves.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defn hero-unit
  []
  [:div.hero-unit
   [:p
    [:img {:src "img/cavemancraves-brown-logo.jpeg" :alt "Caveman Craves
           logo"}]
    [:h1 "Caveman Craves"]
    "On a misson to supply fellow followers of a healthy lifestyle with 
    foodie treats, that are not only tasty but full of goodness too."]
   [:p
    [:a.btn.btn-primary.btn-large "Learn more &raquo;"]]])

(defn what-we-make
  []
  [:div.row {:id "whatwemake"}
   [:div.span12
    [:h2 "What me make"]
    [:div.row
     [:div.span4
      [:h3 "Tasty treats"]
      [:p "Here at Caveman Craves we bake a variety of different tasty 
       treats.  From cookies, cakes, muffins, breads to snack bars. We 
       provide everyday snacks for the modern caveman/woman, those who 
       like to eat healthily, people with allergies and those who just 
       want to try something a little different.. We also bake treats 
       for special occasions like birtdays, prizes, life events and 
       celebrations"]]
     [:div.span4
      [:h3 "Real home made"]
      [:p "Each item is baked to order, so we can match your specific 
       needs. There is nothing generic about our products. 
       Cookies/Muffins/Breads are free to rise with no restrictions.
       This means that they come out looking rustic, no perfectly round 
       cookies, no smooth edged bread- but this is good. We like 
       rustic. "]]
     [:div.span4
      [:h3 "Healthy ingredients"]
      [:p "No wheat/grains, no dairy, no gluten, no sugar, only natural 
       ones that the caveman could gather from trees and the homes of 
       bees. We aim to keep our ingredients as natural and flavoursome 
       as possible, using no artificial preservatives, flavours or 
       colourings. We also care about our impact on the environment so 
       aim to use bio-degradable/recyclable materials."]]]
    [:ul.thumbnails
     [:li.span3
      [:div.thumbnail
       [:img {:src 
              "img/almond-olive-flax-loaf.jpg" 
              :alt "Almond, olive oil and flax loaf"}]
       [:p "Almond, olive oil and flax loaf"]]]
     [:li.span3
      [:div.thumbnail
       [:img {:src "img/selection-box.jpg" 
              :alt "Selection box"}]
       [:p "Selection Box of Hazelnut & Choc Cookies"]]]
     [:li.span3
      [:div.thumbnail
       [:img {:src"img/cocunut-cranberry-seed-bread.jpg" 
              :alt "Coconut, cranberry and seed bread"}]
       [:p "Cocunut, cranberry and seed bread"]]]
     [:li.span3
      [:div.thumbnail
       [:img {:src "img/hazelnut-cocoa-choc-cip.jpg"
              :alt "Hazelnut and cocoa choc cip"}]
       [:p "Hazelnut and 80% cocoa choc cip"]]]]]])

(defn dummy
  []
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
     [:a.btn {"href" "#"} "Google Checkout"]]]])

(defpage "/" []
  (common/layout
   (list 
	(hero-unit)
	(what-we-make)
    (dummy))))