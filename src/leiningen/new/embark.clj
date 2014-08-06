(ns leiningen.new.embark
  (:use [leiningen.new.templates :only [renderer name-to-path ->files]]))

(def render (renderer "embark"))

(defn embark
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
             ["clj/src/{{sanitized}}/handler.clj" (render "handler.clj" data)]
             ["cljs/src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
             ["cljs/test/{{sanitized}}/core_test.cljs" (render "core_test.cljs" data)]
             ["project.clj" (render "project.clj" data)]
             ["README.md" (render "README.md" data)]
             [".gitignore" (render "gitignore")]
             ["LICENSE" (render "LICENSE")]
             ["resources/public/index.html" (render "index.html" data)]
             ["resources/public/css/{{name}}.css" (render "temp.css" data)]
             "resources/public/img"
             "resources/public/js")))
