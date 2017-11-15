(ns four-clojure.problem-44)

(defn rotate
  [n xs]
  (let [offset (rem n (count xs))]
    (cond 
      (> offset 0) (concat (drop offset xs) (take offset xs))
      (= offset 0) xs
      :else (concat (take-last (Math/abs offset) xs)
                    (drop-last (Math/abs offset) xs)))))
