use db_cidade_das_carnes;

select * from tb_categoria;

alter table tb_categoria change tipo_animal_categoria tipo varchar(45);
alter table tb_produto modify column preco_produto decimal(7,2);
insert into tb_categoria
	values 	(1, "Carne Bovina", "Consumível"),
			(2, "Carne Suína", "Consumível"),
            (3, "Carne Caprina", "Consumível"),
            (4, "Carne de Frango", "Consumível"),
            (5, "Acessórios para Churrasco", "Não Consumível");
            
select * from tb_produto;
describe tb_produto;

insert into tb_produto
values 	(1, "Picanha", '98.50', '2020-12-02', 1),
		(2, "Costela", '59.90', '2020-11-29', 2),
		(3, "Coração", '4.90', '2020-12-01', 4),
		(4, "Carvão", '10.50', '2022-12-01', 5),
		(5, "Pernil", '112.90', '2020-12-05', 3),
		(6, "Asinha", '12.90', '2020-12-03', 4),
		(7, "Filé Mignon", '100.00', '2020-11-29', 1),
        (8, "Amolador de Faca", '45.50', null, 5);
        
            
            