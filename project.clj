(defproject liverepl "1.2.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [clojure-complete "0.2.5"]]
  :java-source-paths ["liverepl-agent/src" "liverepl-server/src"]
  :manifest {"Agent-Class" "net.djpowell.liverepl.agent.Agent"
             "Main-Class" "net.djpowell.liverepl.client.Main"}
  :uberjar-name "liverepl.jar"
  :main liverepl.main
  :plugins [[lein-jdk-tools "0.1.1"]])
