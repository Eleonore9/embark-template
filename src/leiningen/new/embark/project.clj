(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "My project description"
  :url "http://myurl.net"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2202"]
                 [compojure "1.1.8"]
                 [selmer "0.6.9"]]

  :plugins [[lein-cljsbuild "1.0.3"]
            [com.cemerick/clojurescript.test "0.2.3"]
            [lein-ring "0.8.11"]]

  :ring {:handler {{name}}.handler/app}

  :source-paths ["clj/src" "templates"]
  :test-paths   ["clj/test"]
  
  :profiles
    {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                          [ring-mock "0.1.5"]]}}

  :cljsbuild {
    :builds {
      :release {
        :source-paths ["cljs/src"]
        :compiler {
          :output-to "resources/public/js/{{name}}.js"
          :output-dir "resources/public/js/out"
          :optimizations :none}}

      :testing {
        :source-paths ["cljs/src" "cljs/test"]
        :compiler {
          :output-to "target/testing/{{name}}-test.js"
          :optimizations :simple}}}

    :test-commands {"unit" ["phantomjs" :runner "target/testing/{{name}}-test.js"]}})
