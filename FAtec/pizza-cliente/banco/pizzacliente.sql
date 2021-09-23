create database pizzacliente;

create table pizzacliente.cli_cliente(
	cli_id int not null auto_increment,
	cli_nome varchar(255) not null,
	cli_telefone varchar (10) not null,
        cli_endereco varchar (30) not null,
	primary key (cli_id));

create table pizzacliente.tipo_tipo(
	tipo_id int not null auto_increment,
	tipo_saida varchar(30) not null,
	tipo_bebida varchar (30) not null,
       
	primary key (tipo_id));
