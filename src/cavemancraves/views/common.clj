(ns cavemancraves.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-js include-css html5]]))

(defn navbar []
  [:div.navbar.navbar-inverse.navbar-fixed-top
   [:div.navbar-inner
    [:div.containter
     [:a.btn.btn-navbar {"data-toggle" "collapse" "data-target" 
                         ".nav-collapse"}
      [:span.icon-bar]
      [:span.icon-bar]
      [:span.icon-bar]]
     [:a.brand "Caveman Craves"]
     [:div.nav-collapse.collapse
       [:ul.nav
        [:li.active
         [:a {"href" "#"} "Home"]]
        [:li
         [:a {"href" "#whatwemake"} "What we make"]]
        [:li
         [:a {"href" "#huntusdown"} "Hunt us down"]]
        [:li
         [:a {"href" "#aboutus"} "About us"]]]]]]])

(defn metatags []
  (list [:meta {"charset" "utf-8"}]
        [:meta {"name" "viewport" "content" "width=device-width, inital-scale=1.0"}]
        [:meta {"name" "description" "content" "caveman craves web site"}]
        [:meta {"name" "author" "content" "frozenbee"}]))

(defn css []
  (list
   (include-css "css/bootstrap.css")
   (include-css "css/cavemancraves.css")
   (include-css "css/bootstrap-responsive.css")
   (include-css "css/font-awesome.css")
   [:style "body { padding-top: 60px; padding-bottom: 40px; }"]))

(defpartial layout [& content]
  (html5
   [:head
    (metatags)
    [:title "Caveman Craves!"]
    [:link {:rel "shortcut icon" :href "favicon.ico"}]
    (css)]
   [:body
    (navbar)
    [:div.container content
     [:hr]
     [:footer
      [:p "&copy; Caveman Craves 2012"]]]
    (include-js 
     "http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js")
    (include-js "/js/bootstrap.js")]))