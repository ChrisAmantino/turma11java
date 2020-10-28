select tb_produto.id_produto, tb_produto.nome_produto, tb_produto.preco_produto, tb_produto.validade_produto, tb_categoria.id_categoria,
tb_categoria.nome_categoria
 from tb_produto
inner join tb_categoria
on tb_produto.tb_categoria_id_categoria = tb_categoria.id_categoria;