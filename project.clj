(defproject svg-to-hiccup "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/data.xml "0.0.8"]
                 [clj-tagsoup/clj-tagsoup "0.3.0" :exclusions [org.clojure/clojure org.clojure/data.xml]]
                 ;[org.clojure/tools.cli "1.0.206"]
                 ]
  :main svg-to-hiccup.core
  :repl-options {:init-ns svg-to-hiccup.core})
