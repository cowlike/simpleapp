(ns simpleapp.sessionbeans.tests
  (:use [clojure.test :only (deftest is run-tests)])
  (:import (simpleapp.sessionbeans LoggerBean)))

(deftest test-logger
  (-> (LoggerBean.) (.log 0 "this is a Clojure test")))

(deftest random-test
  (is (= 1 (- 42 41))))

