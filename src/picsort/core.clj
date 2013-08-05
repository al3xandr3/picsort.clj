(ns picsort.core
  (:require
    [me.raynes.fs :as fs]
    [clj-time.coerce :as tmcoerce]
    [clj-time.format :as tmformat]
    [picsort.exif :as exif])
    (:use [clojure.tools.logging :only (info error)])
  (:gen-class))

(defn print-date
  [date]
  (tmformat/unparse (tmformat/formatter "yyyyMMdd") (tmcoerce/from-date date)))

(defn organize-pics
  "main driver"
  [path]
  (let [dir  path
        pics (fs/glob (str dir "*.{jpg,JPG,gif,GIF,png,PNG}"))]
    (info (str "PATH: " (fs/absolute-path path)))
    (info (str "PICS: " pics))
    (doseq [pic pics]
      (try
        (let [newdir (str dir "\\" (print-date (exif/date pic)))]
          ; create dir
          (if (not (fs/exists? newdir))
          (fs/mkdir newdir))
          ; copy file
          (fs/copy pic (str newdir "\\" (fs/base-name pic)))
          ; delete file
          (fs/delete pic))
        (catch Exception e
         (error e " pic error:" pic)))
        )))
;;(organize-pics "c:\\zip\\pics\\")
;;(organize-pics ".")
;;(organize-pics "c:/zip/pics\\")

(defn -main []
  (organize-pics ".\\")
  )

;;(-main)
