DROP DATABASE IF EXISTS agenda;

CREATE DATABASE agenda;

USE agenda;

CREATE TABLE contatos (
	id       INTEGER PRIMARY KEY AUTO_INCREMENT, 
	nome     VARCHAR(50),
	telefone VARCHAR(20),
	email    VARCHAR(50)
);

INSERT INTO contatos
VALUES (
	DEFAULT,
	"Jiraya",
	"99882211",
	"ji@raya.com"
);

