(ns mystic-maps.ui.enhancements

(defn enhanced-map-view [data]
  (let [elements ([{:name \"Tree\" :width 500} {:type \"Mountain\" :height 300}])]
    [h:div

      [h:ul for [el in elements]
        [h:li {:key i }:name el:name]]
      )]
    )