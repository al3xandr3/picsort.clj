(ns picsort.exif
  (:import [com.drew.metadata.exif ExifIFD0Directory ExifIFD0Descriptor ExifSubIFDDirectory]
           [com.drew.metadata.iptc IptcDirectory]
           [com.drew.imaging ImageMetadataReader]))
; http://metadata-extractor.googlecode.com/svn/trunk/Javadoc/com/drew/metadata/exif/ExifSubIFDDirectory.html

(defn get-exif-dir
  [photo dir]
   (let [metadata  (ImageMetadataReader/readMetadata photo)
         directory (.getDirectory metadata dir)]
     directory))

(defn get-exif-tag
  [photo dir tag]
  (let [metadir  (get-exif-dir photo dir)
        property (.getString metadir tag)]
    property))

(defn manufacturer [photo]
  (get-exif-tag photo ExifIFD0Directory ExifIFD0Directory/TAG_MAKE))

(defn model [photo]
  (get-exif-tag photo ExifIFD0Directory ExifIFD0Directory/TAG_MODEL))

(defn date [photo]
  (let [metadir (get-exif-dir photo ExifSubIFDDirectory)]
   (.getDate metadir ExifSubIFDDirectory/TAG_DATETIME_ORIGINAL)))

(defn orientation [photo]
  (let [metadir (get-exif-dir photo ExifIFD0Directory)]
    (.getOrientationDescription (ExifIFD0Descriptor.  metadir))))

