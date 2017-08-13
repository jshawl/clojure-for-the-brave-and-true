(defn fib
  ([x]
    (fib x [1 2])
  )
  ([x, all]
    (if (>= (last all) x)
      all
      (fib (dec x) (conj all (+ (last all) (last (butlast all))) )))
   )
)

(print (reduce + (filter even? (fib 4000000))))