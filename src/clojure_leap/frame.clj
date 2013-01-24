(ns clojure-leap.frame
  (:import (com.leapmotion.leap Frame
                                Pointable PointableList
                                Hand HandList
                                Finger FingerList
                                Tool ToolList)))


(defn ^HandList hands [^Frame frame]
  (.hands frame))
 
(defn hands? [^Frame frame]
  (.empty (.hands frame)))

(defn ^Hand raw-hand [^Frame frame hand-id]
  (.hand frame hand-id))

(defn hand [^Frame frame hand-id]
  {:pre [(integer? hand-id)]}
  (let [hand (.hand frame hand-id)]
    (when (.isValid hand)
      hand)))

(defn ^FingerList fingers
  "Get the FingerList for a given Frame"
  [^Frame frame]
  (.fingers frame))

(defn fingers?
  "Are there any fingers detected for a given Frame"
  [^Frame frame]
  (.empty (.fingers frame)))

(defn ^Finger raw-finger [^Frame frame finger-id]
  (.finger frame finger-id))

(defn finger [^Frame frame finger-id]
  {:pre [(integer? finger-id)]}
  (let [finger (.finger frame finger-id)]
    (when (.isValid finger)
      finger)))

(defn ^ToolList tools [^Frame frame]
  (.tools frame))

(defn tools? [^Frame frame]
  (.empty (.tools frame)))

(defn ^Tool raw-tool [^Frame frame tool-id]
  (.tool frame tool-id))

(defn tool [^Frame frame tool-id]
  {:pre [(integer? tool-id)]}
  (let [tool (.tool frame tool-id)]
    (when (.isValid tool)
      tool)))

(defn ^PointableList pointables [^Frame frame]
  (.pointables frame))

(defn pointables? [^Frame frame]
  (.empty (.pointables frame)))

(defn ^Pointable raw-pointable [^Frame frame pointable-id]
  (.pointable frame pointable-id))

(defn pointable [^Frame frame pointable-id]
  {:pre [(integer? pointable-id)]}
  (let [pointable (.pointable frame pointable-id)]
    (when (.isValid pointable)
      pointable)))

(defn valid? [^Frame frame]
  (.isValid frame))

(defn timestamp [^Frame frame]
  (.timestamp frame))

(defn ^Frame invalid-frame []
  (Frame.))
