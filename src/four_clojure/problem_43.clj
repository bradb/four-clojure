(ns four-clojure.problem-43)

(fn rev-int
  ([xs n]
   (rev-int xs n (vec (repeat n []))))
  ([xs n ys]
   (if-not (empty? xs)
       (let [xs' (take n xs)]
         (recur (drop n xs) n (map #(conj %1 %2) ys xs')))
       ys)))
