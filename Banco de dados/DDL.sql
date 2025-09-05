-- DDL do projeto Old Burguer --

CREATE SCHEMA old_burguer;
-- Criando Schema onde está todo o meu projeto

-- Criando tabelas:
SET search_path TO old_burguer;
CREATE TABLE old_burguer.restaurante(
	id_restaurante INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	nome TEXT NOT NULL,
	endereco TEXT NOT NULL,
	descricao TEXT 
);

CREATE TABLE old_burguer.cliente(
	id_cliente INT PRIMARY KEY GENERATED ALWAYS as IDENTITY,
	nome TEXT NOT NULL,
	email TEXT NOT NULL,
	data_nascimento date NOT NULL,
	endereco TEXT NOT NULL
);

CREATE TABLE old_burguer.pagamento(
	id_pagamento INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	forma_pagamento TEXT NOT NULL
);

CREATE TABLE old_burguer.produto(
	id_produto INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	nome TEXT NOT NULL,
	preco NUMERIC(7,3),
	categoria TEXT NOT NULL
);
CREATE TABLE old_burguer.pedido(
	id_pedido INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	id_restaurante INT NOT NULL,
	id_cliente INT NOT NULL,
	id_pagamento INT NOT NULL,
	data_pedido TIMESTAMPTZ NOT NULL,
	status TEXT NOT NULL,
	FOREIGN KEY(id_restaurante) REFERENCES old_burguer.restaurante(id_restaurante),
	FOREIGN KEY(id_cliente) REFERENCES old_burguer.cliente(id_cliente),
	FOREIGN KEY(id_pagamento) REFERENCES old_burguer.pagamento(id_pagamento)
	
);

CREATE TABLE old_burguer.item_do_pedido(
	id_item_do_pedido INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	quantidade INT NOT NULL,
	id_pedido INT NOT NULL,
	id_produto INT NOT NULL,
	FOREIGN KEY (id_pedido) REFERENCES old_burguer.pedido(id_pedido),
	FOREIGN KEY (id_produto) REFERENCES old_burguer.produto(id_produto)
	
);


-- Comandos para remover, caso necessário:
DROP TABLE old_burguer.restaurante;
DROP TABLE old_burguer.cliente;
DROP TABLE old_burguer.pagamento;
DROP TABLE old_burguer.produto;
DROP TABLE old_burguer.pedido;
DROP TABLE old_burguer.item_do_pedido;
