(ns {{name}}.handler-test
  (:require [{{name}}.handler :as handler]
            [clojure.test :refer [deftest is]]))

(deftest test-handler
  (is (= "Hello, {{name}}!" (handler/get-message))))
