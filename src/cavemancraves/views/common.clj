(ns cavemancraves.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-js include-css html5]]))

(defn navbar []
  [:div.navbar.navbar-fixed-top {"data-toggle" "collapse" "data-target" ".nav-collapse"}
   [:div.navbar-inner
    [:div.containter
     [:a.btn.btn-navbar
      [:span.icon-bar]]
     [:a.bramd "Caveman Craves!"]
     [:div.nav-collapse
       [:ul.nav
        [:li.ative
         [:a {"href" "#"} "Home"]]]]]]])

(defpartial layout [& content]
  (html5
   [:head
    [:title "Caveman Craves!"]
    [:meta {"name" "viewport"}]
    (include-css "css/bootstrap.css")
    (include-css "css/bootstrap-responsive.css")]
   [:body
    (navbar)
    [:div.container content]
    (include-js 
     "http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js")
    (include-js "/js/bootstrap.js")]))

