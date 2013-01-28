(defproject al3xandr3/picsort "0.1.0"
  :description "A Micro Photo Organizer"
  :url "https://github.com/al3xandr3/picsort"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0" ]
                 [fs "1.3.2" :exclusions [[org.apache.commons/commons-compress]] ]
                 [clj-time "0.4.4"]
                 [com.drewnoakes/metadata-extractor "2.6.2" :exclusions [
                                                                         [xerces/xercesImpl]        
                                                                         ]
                  ]
                 ;;[seesaw "1.4.2"]
                 ]
  :main picsort.core)
  