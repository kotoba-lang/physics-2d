(ns physics_2d-test
  (:require [clojure.test :refer [deftest is testing]]
            [physics_2d]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? physics_2d))))
