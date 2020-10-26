create database db_rh;
use db_rh;

create table funcionarios (
	nome varchar(30),
    idade int(2),
    sexo enum ('M', 'F', 'O'),
    filial enum ('São Paulo', 'Rio de Janeiro'),
    salario decimal(5,2)
);

select * from funcionarios;

alter table funcionarios add column id int primary key not null auto_increment first;

select * from funcionarios;

alter table funcionarios modify column salario decimal(10,2);
