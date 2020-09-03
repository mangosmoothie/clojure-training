(ns clojure-class.core-test
  (:require [clojure.test :refer :all]
            [clojure-class.core :refer :all]))

(defn add-two [x] (+ x 2))

(deftest a-test
  (is (= (add-one 3) 4)))

