select * from tb_produto
inner join tb_categoria
on tb_produto.tb_categoria_id_categoria = tb_categoria.id_categoria
where tb_categoria.nome_categoria = "Carne Bovina";

select * from tb_produto
inner join tb_categoria
on tb_produto.tb_categoria_id_categoria = tb_categoria.id_categoria
where tb_categoria.nome_categoria = "Carne Suína";

select * from tb_produto
inner join tb_categoria
on tb_produto.tb_categoria_id_categoria = tb_categoria.id_categoria
where tb_categoria.nome_categoria = "Carne Caprina";

select * from tb_produto
inner join tb_categoria
on tb_produto.tb_categoria_id_categoria = tb_categoria.id_categoria
where tb_categoria.nome_categoria = "Acessórios para Churrasco";