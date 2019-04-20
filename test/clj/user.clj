(ns user
  (:require [mount.core :as mount]
            [remark.figwheel :refer [start-fw stop-fw cljs]]
            [garden-gnome.watcher :as garden-gnome]
            remark.core-test))

(mount/defstate garden
  :start (garden-gnome/start! (garden-gnome/default-config))
  :stop (garden-gnome/stop! garden))

(defn start []
  (mount/start)
  ;(mount/start-without #'remark.core-test/repl-server)
  )

(defn stop []
  (mount/start)
  ;(mount/stop-except #'remark.core-test/repl-server)
  )

(defn restart []
  (stop)
  (start))


