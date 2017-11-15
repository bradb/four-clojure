(ns four-clojure.problem-26)

(defn fib
  ([n]
   (case n
         1 [1]
         (fib (- n 2) [1 1])))
  ([n xs]
   (if (= n 0)
     xs
     (recur (dec n) (->> (take-last 2 xs)
                         (apply +)
                         (conj xs))))))
