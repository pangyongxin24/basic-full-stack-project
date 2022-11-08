# SQL script to generate the database.

DROP DATABASE user_db;
CREATE DATABASE user_db;

USE user_db;

CREATE TABLE user(
id_person INTEGER NOT NULL AUTO_INCREMENT,
name VARCHAR(250) NOT NULL,
last_name VARCHAR(250) NOT NULL,
age INTEGER NOT NULL,
PRIMARY KEY (id_person)
);

INSERT INTO user(id_person, name, last_name, age) VALUES (NULL, 'Michael', 'Jordan', 50);
INSERT INTO user(id_person, name, last_name, age) VALUES (NULL, 'Silver', 'Cactus', 21);
INSERT INTO user(id_person, name, last_name, age) VALUES (NULL, 'Catty', 'Ta', 20;
INSERT INTO user(id_person, name, last_name, age) VALUES (NULL, 'Charly', 'Montana', 43);
INSERT INTO user(id_person, name, last_name, age) VALUES (NULL, 'Roberto', 'Carlos', 60);
