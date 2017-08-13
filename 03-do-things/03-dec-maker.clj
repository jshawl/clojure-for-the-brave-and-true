(defn dec-maker
  "Returns a function that decrements by the given number"
  [x]
  (fn [y] (- y x))
)
(def dec9 (dec-maker 9))
(print (dec9 10))