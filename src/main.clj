(ns mystic-maps.main

(require ['mystic-maps.ui' 'mongodb-client'])
(def db-connection (mongodb-client/get-db "MysticMaps"))
(def get-map (fn [map-id] (mongodb-client/find-one db-connection \"Maps\" {:_id map-id})))

(def main ([args]
  (let [maps (map get-map [1, 2, 3])]
    (for [map in maps]
      (puts (json-string map))))
