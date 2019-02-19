CREATE DATABASE IF NOT EXISTS kotlin_elastic_db;
USE kotlin_elastic_db;

CREATE TABLE IF NOT EXISTS users(
  id           INT(10),
  name     VARCHAR(40)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO users (id, name) VALUES (1, 'Hakiba');
INSERT INTO users (id, name) VALUES (2, 'Baki');
INSERT INTO users (id, name) VALUES (3, 'Ryochin');