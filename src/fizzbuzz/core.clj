(ns fizzbuzz.core)

(defn fizzbuzz [x]
  (cond (= (mod x 15) 0) "FizzBuzz"
        (= (mod x 5) 0) "Buzz"
        (= (mod x 3) 0) "Fizz"
        :else x))

(defn main [n]
  (map fizzbuzz (take n (iterate inc 1))))
