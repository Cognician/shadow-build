(defproject thheller/shadow-build "0.7.0"
  :description "cljs compiler"
  :url "https://github.com/thheller/shadow-build"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies []

  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[org.clojure/clojure "1.6.0"]
                                  [aysylu/loom "0.5.0"]
                                  [org.clojure/tools.namespace "0.2.4"]
                                  [org.clojure/clojurescript "0.0-2138"
                                   :exclusions [org.clojure/google-closure-library]]
                                  [org.clojure/tools.logging "0.3.0"]
                                  [ch.qos.logback/logback-classic "1.1.2"]
                                  [org.slf4j/jul-to-slf4j "1.7.7"]
                                  [org.slf4j/jcl-over-slf4j "1.7.7"]
                                  [org.slf4j/log4j-over-slf4j "1.7.7"]
                                  ]}}

  :source-paths ["src/clj"]
  :jvm-opts ["-Dlogback.configurationFile=logback.xml"])
