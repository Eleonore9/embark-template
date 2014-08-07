(ns {{name}}.handler
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [selmer.parser :as selmer]))

(defroutes app-routes
  (GET "/" [] (selmer/render-file "index.html" {}))
    (route/resources "/")
    (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
