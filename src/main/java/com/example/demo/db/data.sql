-- Active: 1774215634831@@127.0.0.1@3306@forage
CREATE TABLE clients(  
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(255),
    contact INT,
    adresse VARCHAR(100)
);

CREATE TABLE commune(
    id int PRIMARY KEY AUTO_INCREMENT,
    libelle VARCHAR(100),
    id_district INT
);

CREATE TABLE district(
    id INT PRIMARY KEY AUTO_INCREMENT,
    libelle VARCHAR(100),
    id_region INT
);

CREATE TABLE region(
    id INT PRIMARY KEY AUTO_INCREMENT,
    libelle VARCHAR(100)
);

CREATE TABLE statut(
    id INT PRIMARY KEY AUTO_INCREMENT,
    libelle VARCHAR(100)
);

CREATE TABLE commune(
    id INT PRIMARY KEY AUTO_INCREMENT,
    libelle VARCHAR(100),
    id_district INT
);

CREATE TABLE demande(
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_client INT,
    id_commune INT,
    lieu VARCHAR(100)
);

CREATE TABLE demande_statut(
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_demande INT,
    id_statut INT,
    dates DATE
);