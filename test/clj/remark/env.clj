(ns remark.env
  (:require 
            [clojure.tools.logging :as log]
            [remark.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[remark started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[remark has shut down successfully]=-"))
   :middleware wrap-dev})
