(defproject uncomplicate/fluokitten "0.1.0-SNAPSHOT"
  :description "Category theory concepts in Clojure - Functors, Applicatives, Monads, Monoids and more."
  :url "https://github.com/uncomplicate/fluokitten"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :plugins [[codox "0.6.4"]]
  :codox {:src-dir-uri "http://github.com/uncomplicate/fluokitten/blob/master"
          :src-linenum-anchor-prefix "L"
          :exclude [uncomplicate.fluokitten.algo]
          :output-dir "doc/codox"}
  :profiles {:dev {:dependencies [[midje "1.5.0"]]
                   :plugins [[lein-midje "3.0.0"]]}})