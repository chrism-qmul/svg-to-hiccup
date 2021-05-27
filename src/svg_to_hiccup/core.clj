(ns svg-to-hiccup.core
  (:require [pl.danieljanus.tagsoup :as ts]
            [clojure.pprint :refer [pprint]])
  (:gen-class))

(defn -main [& args]
  (if-let [filename (first args)]
    (pprint (ts/parse filename))
    (prn "Usage: <filename>")))
