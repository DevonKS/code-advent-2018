(ns code-advent-2018.day-5.challenge-test
  (:require [clojure.test :refer :all]
            [code-advent-2018.day-5.challenge :refer :all]))

(deftest challenge1-test
  (testing "Challenge 1 Test"
    (is (= 9348 (challenge1 "input.txt")))))

(deftest challenge2-test
  (testing "Challenge 2 Test"
    (is (= 4996 (challenge2 "input.txt")))))