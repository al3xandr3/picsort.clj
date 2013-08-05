
# picsort

> A Micro Photo Organizer

## Download

[picsort.jar](https://dl.dropboxusercontent.com/u/8118736/picsort/picsort.jar)

For Windows, Mac, Linux. Requires Java installed.

## Usage

After you get the photos from your camera use this application to automatically organize the photos into folders.

Place this application next to(in same folder of) the photos you want to organize and run it.

It will create new folders and place/organize your photos into them.

## Version Log

- 0.1.0 - First working version, requires placing the application in same folder as the photos. Creates folders by day.
- 0.2.0 - Continue if hits files with problems, weird path problem, update libs, added logging.

## TODO

  - works on MAC / Linux? (becuase of weird path problems...)
  - photo filters (like instagram)

## Ideas

  - instead of organizing per day, use a time break between photos (5+ hours?) to assume is a different set(& place into different folder)

  - instead of organizing per day, organize by (geoip) location? could even fetch from geo service the name of the location

  - fix orientation (really worth? most pic viewing apps know how to fix)

  - suggest delete photo when unfocused? (might be tricky to get right): https://github.com/zakwilson/fuzzbuster

  - select a group of very similar fotos, allow pick the best one and delete the others (instead of un-focused ones) - show 2 at time and say pick the best one: https://github.com/zakwilson/imgcompare

  - apply automatic filters to all pics? how to identify the best filter for each pic?
   	- https://github.com/mikera/clisk
  	- http://www.quora.com/Instagram/How-does-Instagram-develop-their-filters#
  	- https://clojars.org/search?q=image

  - do cameras have GPS coordinates positioning? could use for description?

  - avoid moving the application around, add an interface to allow for a configurable photos folder. - allow for a config file next to application, to save the previous preferences.

  - allow each new folder to have an added description(from user input) like date_<description>/, with an interface show next to each folder a set of thumbnails to allow to identify it easeally() or the first thumbnail from the set)

  - delete duplicated pics? https://github.com/sleask/dupe-can

## On the shoulders of:
- EXIF extractor - https://code.google.com/p/metadata-extractor/
- clojure FileSystem utils - https://github.com/Raynes/fs

## License

Copyright © 2013 al3xandr3

Distributed under the Eclipse Public License, the same as Clojure.
