(defn mapset
  "Works like map, but the return value is a set"
  [f collection]
  (set (map f collection))
)

(println (mapset inc [1 1 2 2]))