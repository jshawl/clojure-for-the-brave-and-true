(defn sum-multiples-of-3-and-5
  "finds multiples of 3 and 5 up to a certain number"
  [x]
  (reduce + (filter (fn [x]
    (or (zero? (mod x 3)) (zero? (mod x 5))))
    (range 1 x 1)
  ))
)

(println (sum-multiples-of-3-and-5 1000))