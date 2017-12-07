create database hsmart
go
use hsmart

CREATE TABLE endereco(
cep INT NOT NULL,
bairro CHAR(50) NOT NULL,
cidade CHAR(50) NOT NULL,
estado CHAR(50) NOT NULL,
logradouro CHAR(200) NOT NULL
PRIMARY KEY(cep)
)

select * from endereco

CREATE TABLE cliente(
nome CHAR(200) NOT NULL,
cpf INT NOT NULL,
rg INT,
numero	INT NOT NULL,
telefone INT,
email CHAR(200),
cep INT NOT NULL
FOREIGN KEY(cep) REFERENCES endereco(cep)
PRIMARY KEY(cpf)
)

select * from cliente

CREATE TABLE produto(
modelo CHAR(15) NOT NULL,
especs CHAR(250),
tela INT,
processador CHAR(10),
memoria CHAR(10),
so CHAR(10),
valor INT NOT NULL,
tipo CHAR(10),
bateria CHAR(15),
camera CHAR(10),
marca CHAR(20)
PRIMARY KEY(modelo)
)

select * from produto
