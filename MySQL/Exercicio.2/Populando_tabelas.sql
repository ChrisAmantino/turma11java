use db_rh2;

select * from tb_cargo;
select * from tb_funcionario;

insert into tb_cargo 
	values  (1, "Cientista de Dados", 'TI'),
			(2, "Desenvolvedor Back End", 'TI'),
			(3, "Desenvolvedor Front End", 'TI'),
			(4, "Gerente Rh", 'ADM'),
			(5, "Gerente Administrativo", 'ADM');
            
insert into tb_funcionario
	values  (1, "Christian", 4800.00, 'M', 1),
			(2, "Maria", 5800.00, 'F', 4),
			(3, "Carlos", 1900.00, 'M', 3),
			(4, "Joana", 2100.00, 'F', 3),
			(5, "José", 6900.00, 'M', 5),
			(6, "Marta", 1600.00, 'F', 3),
			(7, "Cristiene", 6750.00, 'F', 1),
			(8, "Ricardo", 7600.00, 'M', 2),
			(9, "Nauan", 1200.00, 'O', 3),
			(10, "Marcos", 8900.00, 'M', 1),
			(11, "Juliana", 3500.00, 'F', 2),
			(12, "Luiz", 1100.00, 'M', 3),
			(13, "Frederico", 6200.00, 'M', 1),
			(14, "Monica", 5800.00, 'F', 2),
			(15, "Mustafá", 3950.00, 'O', 3);
            