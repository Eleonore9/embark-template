(ns leiningen.new.embark
  (:use [leiningen.new.templates :only [renderer name-to-path ->files]]))

(def render (renderer "embark"))

(defn embark
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)]
             ["clj/src/{{sanitized}}/handler.clj" (render "handler.clj" data)]
             ["cljs/src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
             ["cljs/test/{{sanitized}}/core_test.cljs" (render "core_test.cljs" data)]
             ["resources/public/css/{{name}}.css" (render "temp.css" data)]
             ["project.clj" (render "project.clj" data)]
             ["resources/public/img"]
             ["resources/public/js"])))
