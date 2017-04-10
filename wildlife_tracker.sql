--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.2
-- Dumped by pg_dump version 9.6.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: animals; Type: TABLE; Schema: public; Owner: slaughtr
--

CREATE TABLE animals (
    id integer NOT NULL,
    name character varying,
    health character varying,
    age character varying,
    image_url character varying
);


ALTER TABLE animals OWNER TO slaughtr;

--
-- Name: animals_id_seq; Type: SEQUENCE; Schema: public; Owner: slaughtr
--

CREATE SEQUENCE animals_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE animals_id_seq OWNER TO slaughtr;

--
-- Name: animals_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: slaughtr
--

ALTER SEQUENCE animals_id_seq OWNED BY animals.id;


--
-- Name: endangered_animals; Type: TABLE; Schema: public; Owner: slaughtr
--

CREATE TABLE endangered_animals (
    id integer NOT NULL,
    name character varying,
    health character varying,
    age character varying,
    image_url character varying
);


ALTER TABLE endangered_animals OWNER TO slaughtr;

--
-- Name: endangered_animals_id_seq; Type: SEQUENCE; Schema: public; Owner: slaughtr
--

CREATE SEQUENCE endangered_animals_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE endangered_animals_id_seq OWNER TO slaughtr;

--
-- Name: endangered_animals_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: slaughtr
--

ALTER SEQUENCE endangered_animals_id_seq OWNED BY endangered_animals.id;


--
-- Name: locations; Type: TABLE; Schema: public; Owner: slaughtr
--

CREATE TABLE locations (
    id integer NOT NULL,
    name character varying
);


ALTER TABLE locations OWNER TO slaughtr;

--
-- Name: locations_id_seq; Type: SEQUENCE; Schema: public; Owner: slaughtr
--

CREATE SEQUENCE locations_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE locations_id_seq OWNER TO slaughtr;

--
-- Name: locations_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: slaughtr
--

ALTER SEQUENCE locations_id_seq OWNED BY locations.id;


--
-- Name: rangers; Type: TABLE; Schema: public; Owner: slaughtr
--

CREATE TABLE rangers (
    id integer NOT NULL,
    name character varying,
    email character varying,
    station_id integer
);


ALTER TABLE rangers OWNER TO slaughtr;

--
-- Name: rangers_id_seq; Type: SEQUENCE; Schema: public; Owner: slaughtr
--

CREATE SEQUENCE rangers_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE rangers_id_seq OWNER TO slaughtr;

--
-- Name: rangers_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: slaughtr
--

ALTER SEQUENCE rangers_id_seq OWNED BY rangers.id;


--
-- Name: sightings; Type: TABLE; Schema: public; Owner: slaughtr
--

CREATE TABLE sightings (
    id integer NOT NULL,
    animal_id integer,
    ranger_id integer,
    last_sighting timestamp without time zone,
    location_id integer
);


ALTER TABLE sightings OWNER TO slaughtr;

--
-- Name: sightings_animals; Type: TABLE; Schema: public; Owner: slaughtr
--

CREATE TABLE sightings_animals (
    id integer NOT NULL,
    animal_id integer,
    sighting_id integer
);


ALTER TABLE sightings_animals OWNER TO slaughtr;

--
-- Name: sightings_animals_id_seq; Type: SEQUENCE; Schema: public; Owner: slaughtr
--

CREATE SEQUENCE sightings_animals_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sightings_animals_id_seq OWNER TO slaughtr;

--
-- Name: sightings_animals_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: slaughtr
--

ALTER SEQUENCE sightings_animals_id_seq OWNED BY sightings_animals.id;


--
-- Name: sightings_id_seq; Type: SEQUENCE; Schema: public; Owner: slaughtr
--

CREATE SEQUENCE sightings_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sightings_id_seq OWNER TO slaughtr;

--
-- Name: sightings_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: slaughtr
--

ALTER SEQUENCE sightings_id_seq OWNED BY sightings.id;


--
-- Name: stations; Type: TABLE; Schema: public; Owner: slaughtr
--

CREATE TABLE stations (
    id integer NOT NULL,
    name character varying,
    coordinates character varying,
    location_id integer
);


ALTER TABLE stations OWNER TO slaughtr;

--
-- Name: stations_id_seq; Type: SEQUENCE; Schema: public; Owner: slaughtr
--

CREATE SEQUENCE stations_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE stations_id_seq OWNER TO slaughtr;

--
-- Name: stations_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: slaughtr
--

ALTER SEQUENCE stations_id_seq OWNED BY stations.id;


--
-- Name: animals id; Type: DEFAULT; Schema: public; Owner: slaughtr
--

ALTER TABLE ONLY animals ALTER COLUMN id SET DEFAULT nextval('animals_id_seq'::regclass);


--
-- Name: endangered_animals id; Type: DEFAULT; Schema: public; Owner: slaughtr
--

ALTER TABLE ONLY endangered_animals ALTER COLUMN id SET DEFAULT nextval('endangered_animals_id_seq'::regclass);


--
-- Name: locations id; Type: DEFAULT; Schema: public; Owner: slaughtr
--

ALTER TABLE ONLY locations ALTER COLUMN id SET DEFAULT nextval('locations_id_seq'::regclass);


--
-- Name: rangers id; Type: DEFAULT; Schema: public; Owner: slaughtr
--

ALTER TABLE ONLY rangers ALTER COLUMN id SET DEFAULT nextval('rangers_id_seq'::regclass);


--
-- Name: sightings id; Type: DEFAULT; Schema: public; Owner: slaughtr
--

ALTER TABLE ONLY sightings ALTER COLUMN id SET DEFAULT nextval('sightings_id_seq'::regclass);


--
-- Name: sightings_animals id; Type: DEFAULT; Schema: public; Owner: slaughtr
--

ALTER TABLE ONLY sightings_animals ALTER COLUMN id SET DEFAULT nextval('sightings_animals_id_seq'::regclass);


--
-- Name: stations id; Type: DEFAULT; Schema: public; Owner: slaughtr
--

ALTER TABLE ONLY stations ALTER COLUMN id SET DEFAULT nextval('stations_id_seq'::regclass);


--
-- Data for Name: animals; Type: TABLE DATA; Schema: public; Owner: slaughtr
--

COPY animals (id, name, health, age, image_url) FROM stdin;
\.


--
-- Name: animals_id_seq; Type: SEQUENCE SET; Schema: public; Owner: slaughtr
--

SELECT pg_catalog.setval('animals_id_seq', 44, true);


--
-- Data for Name: endangered_animals; Type: TABLE DATA; Schema: public; Owner: slaughtr
--

COPY endangered_animals (id, name, health, age, image_url) FROM stdin;
\.


--
-- Name: endangered_animals_id_seq; Type: SEQUENCE SET; Schema: public; Owner: slaughtr
--

SELECT pg_catalog.setval('endangered_animals_id_seq', 31, true);


--
-- Data for Name: locations; Type: TABLE DATA; Schema: public; Owner: slaughtr
--

COPY locations (id, name) FROM stdin;
\.


--
-- Name: locations_id_seq; Type: SEQUENCE SET; Schema: public; Owner: slaughtr
--

SELECT pg_catalog.setval('locations_id_seq', 5, true);


--
-- Data for Name: rangers; Type: TABLE DATA; Schema: public; Owner: slaughtr
--

COPY rangers (id, name, email, station_id) FROM stdin;
\.


--
-- Name: rangers_id_seq; Type: SEQUENCE SET; Schema: public; Owner: slaughtr
--

SELECT pg_catalog.setval('rangers_id_seq', 17, true);


--
-- Data for Name: sightings; Type: TABLE DATA; Schema: public; Owner: slaughtr
--

COPY sightings (id, animal_id, ranger_id, last_sighting, location_id) FROM stdin;
\.


--
-- Data for Name: sightings_animals; Type: TABLE DATA; Schema: public; Owner: slaughtr
--

COPY sightings_animals (id, animal_id, sighting_id) FROM stdin;
\.


--
-- Name: sightings_animals_id_seq; Type: SEQUENCE SET; Schema: public; Owner: slaughtr
--

SELECT pg_catalog.setval('sightings_animals_id_seq', 1, false);


--
-- Name: sightings_id_seq; Type: SEQUENCE SET; Schema: public; Owner: slaughtr
--

SELECT pg_catalog.setval('sightings_id_seq', 20, true);


--
-- Data for Name: stations; Type: TABLE DATA; Schema: public; Owner: slaughtr
--

COPY stations (id, name, coordinates, location_id) FROM stdin;
\.


--
-- Name: stations_id_seq; Type: SEQUENCE SET; Schema: public; Owner: slaughtr
--

SELECT pg_catalog.setval('stations_id_seq', 13, true);


--
-- Name: animals animals_pkey; Type: CONSTRAINT; Schema: public; Owner: slaughtr
--

ALTER TABLE ONLY animals
    ADD CONSTRAINT animals_pkey PRIMARY KEY (id);


--
-- Name: endangered_animals endangered_animals_pkey; Type: CONSTRAINT; Schema: public; Owner: slaughtr
--

ALTER TABLE ONLY endangered_animals
    ADD CONSTRAINT endangered_animals_pkey PRIMARY KEY (id);


--
-- Name: locations locations_pkey; Type: CONSTRAINT; Schema: public; Owner: slaughtr
--

ALTER TABLE ONLY locations
    ADD CONSTRAINT locations_pkey PRIMARY KEY (id);


--
-- Name: rangers rangers_pkey; Type: CONSTRAINT; Schema: public; Owner: slaughtr
--

ALTER TABLE ONLY rangers
    ADD CONSTRAINT rangers_pkey PRIMARY KEY (id);


--
-- Name: sightings_animals sightings_animals_pkey; Type: CONSTRAINT; Schema: public; Owner: slaughtr
--

ALTER TABLE ONLY sightings_animals
    ADD CONSTRAINT sightings_animals_pkey PRIMARY KEY (id);


--
-- Name: sightings sightings_pkey; Type: CONSTRAINT; Schema: public; Owner: slaughtr
--

ALTER TABLE ONLY sightings
    ADD CONSTRAINT sightings_pkey PRIMARY KEY (id);


--
-- Name: stations stations_pkey; Type: CONSTRAINT; Schema: public; Owner: slaughtr
--

ALTER TABLE ONLY stations
    ADD CONSTRAINT stations_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

