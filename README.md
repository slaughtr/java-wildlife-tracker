## Wildlife Tracker

An app for the forest service to track animals for an environmental impact study.

### Description

The Forest Service is considering a proposal from a timber company to clearcut a nearby forest of Douglas Fir. Before this proposal may be approved, they must complete an environmental impact study. This application was developed to allow Rangers to track wildlife sightings in the area.

### Setup

To create the necessary databases, launch postgres, then psql, and run the following commands:

* `CREATE DATABASE wildlife_tracker;`
* `\c wildlife_tracker;`
* `CREATE TABLE animals (id serial PRIMARY KEY, name varchar, health varchar, age varchar, image_url varchar);`
* `CREATE TABLE endangered_animals (id serial PRIMARY KEY, name varchar, health varchar, age varchar, image_url varchar);`
* `CREATE TABLE sightings (id serial PRIMARY KEY, animal_id int, ranger_id int, last_sighting timestamp, location_id int);`
* `CREATE TABLE locations (id serial PRIMARY KEY, name varchar);`
* `CREATE TABLE rangers (id serial PRIMARY KEY, name varchar, email varchar, station_id int);`
* `CREATE TABLE stations (id serial PRIMARY KEY, name varchar, coordinates varchar, location_id int);`
* `CREATE TABLE sightings_animals (id serial PRIMARY KEY, animal_id int, sighting_id int);`
* `CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;`

###TODO

* Add forms to be able to add rangers, stations, locations, animals, endangered animals, sightings.
* In animals/endangered animals, be able to add picture.
* Use the join table.
* Code cleanup and website styling issues (bad UL placement, etc)
* Add exception catching

### License

Copyright (c) 2017 **_MIT License_**
