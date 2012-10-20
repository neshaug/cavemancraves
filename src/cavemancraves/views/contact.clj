(ns cavemancraves.views.contact
  (:use noir.core hiccup.form-helpers))

(defpartial form []
  (label "name" "Name")
  (text-field "name" "name")
  (label "email" "E-mail")
  (text-field "email" "email")
  (label "message" "Message")
  (text-area "message" "message"))