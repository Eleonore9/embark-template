(ns {{name}}-test
  "Core tests."
  (:require-macros [cemerick.cljs.test :refer [deftest is]])
  (:require [cemerick.cljs.test :as t]
            [{{name}}.core :as core]))

(deftest add-nums-test
  (is (= 5 (core/add-nums 2 3))))

