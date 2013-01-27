(ns picsort.core
  (:require [fs.core :as fs]
            [clj-time.coerce :as tmcoerce]
            [clj-time.format :as tmformat]
            [picsort.exif :as exif])
  (:gen-class))

(defn print-date 
  [date]
  (tmformat/unparse (tmformat/formatter "yyyyMMdd") (tmcoerce/from-date date)))

(defn organize-pics
  "main driver"
  [path]
  (let [dir  path
        pics (fs/glob (str dir "*.{jpg,JPG,gif,GIF,png.PNG}"))]
    (doseq [pic pics]
      (let [newdir (str dir (print-date (exif/date pic)))]
        ; create dir
        (if (not (fs/exists? newdir))         
          (fs/mkdir newdir))
        ; copy file
        (fs/copy pic (str newdir "/" (fs/base-name pic)))
        ; delete file
        (fs/delete pic)))))


;(use 'seesaw.core)
;(native!)
;(def f (frame :title "Get to know Seesaw"))
;(-> f pack! show!)

(defn -main
  [& args]
  (organize-pics ""))

