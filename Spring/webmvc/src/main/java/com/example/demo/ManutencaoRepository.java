package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//Faz a condução dos DADOS da tabela ao banco, serve para inserir os dados no banco
public interface ManutencaoRepository extends JpaRepository<ManutencaoTable, Long>{

	List<ManutencaoTable> findByNome(String nome);

	Optional<ManutencaoTable> findByNomeAndCategoria(String nome, String categoria);
	
}
