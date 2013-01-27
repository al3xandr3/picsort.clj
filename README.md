# picsort

> A Micro Photo Organizer

## Download

## Usage

After you get the photos from your camera use this application to automatically organize the photos into folders.

Place this application next to(in same folder of) the photos you want to organize and run it. 

It will create new folders and place/organize your photos into them.

## Version Log

- 0.1.0 - first working version, requires to place the application in same folder as the photos. Creates folders by day.

# Ideas

  - instead of day, use a time break between photos(5+ hours?) to assume is a different set(& place into different folder)
  - fix orientation(really worth? most pic viewing apps know how to fix)
  - suggest delete photo when unfocused? (might be tricky to get right)
  - select a group of very similar fotos, allow pick the best one and delete the others (instead of un-focused ones) - show 2 at time and say pick the best one.
  - apply automatic filters to all pics? how to identify the best filter for each pic?
  - do cameras have GPS coordinates positioning? could use for description?
  - avoid moving the application around, add an interface to allow for a configurable photos folder. - allow for a config file next to application, to save the previous preferences.
  - allow each new folder to have an added description(from user input) like date_<description>/, with an interface show next to each folder a set of thumbnails to allow to identify it easeally() or the first thumbnail from the set).

# On the shoulders of:
- EXIF extractor - https://code.google.com/p/metadata-extractor/
- clojure Filesystem utils - https://github.com/Raynes/fs

## License

Copyright © 2013 al3xandr3

Distributed under the Eclipse Public License, the same as Clojure.
