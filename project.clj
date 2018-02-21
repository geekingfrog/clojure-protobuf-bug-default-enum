(defproject protobuf-exp "0.1.0-SNAPSHOT"
  :description "Experiments around protobuf, and clojure interop"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [clojusc/protobuf "3.5.1-v1.1-SNAPSHOT"]
                 ]
  :java-source-paths ["src/main/java"]
  :main ^:skip-aot protobuf-exp.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
