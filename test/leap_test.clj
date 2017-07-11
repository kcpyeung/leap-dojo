(ns leap-test
  (:require [clojure.test :refer :all]
            [leap :refer :all]))

(deftest vanilla-leap-year
  (is (leap/leap-year? 1996)))


