(defproject al3xandr3/picsort "0.2.0"
  :description "A Micro Photo Organizer"
  :url "https://github.com/al3xandr3/picsort"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0" ]
                 [me.raynes/fs "1.4.4"]
                 [clj-time "0.5.1"]
                 [com.drewnoakes/metadata-extractor "2.6.2"]
                 [org.clojure/tools.logging "0.2.6"]
                 ]
  :uberjar-name "picsort.jar"
  :main picsort.core
)