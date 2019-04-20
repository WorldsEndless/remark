;; -*- eval: (rainbow-mode) -*-
(ns remark.styles.main
  "Garden styles following the BYU schemes"
  (:require [garden.def :refer [defstylesheet defstyles defkeyframes]]
            [garden.units :as u :refer [px em rem]]
            [garden.color :as c :refer [hex->hsl hsl->hex]] ;:rename {hex->rgb hr, rgb->hex rh}]
            [garden.selectors :as s :refer [nth-child]]))

;;;;;;;;;;;;
;; STYLES ;;
;;;;;;;;;;;;
(defstyles main
  {:vendors ["webkit" "moz" "o" "ms"]}

  )
