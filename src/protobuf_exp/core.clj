(ns protobuf-exp.core
  (:require
    [protobuf.core :as protobuf])
  (:import
    [proto.person
     PersonOuterClass$Person
     PersonOuterClass$Type
     ])
  (:gen-class))

(defn -main
  [& args]
  (let [p (protobuf/create PersonOuterClass$Person {:name "fooName" :type :foo})
        bs (protobuf/->bytes p)
        parsed (protobuf/bytes-> p bs)
        ]
    (println "deserialized:" parsed)
    (println "deserialized type:" (:type parsed) "(should have the default value :foo)")))
