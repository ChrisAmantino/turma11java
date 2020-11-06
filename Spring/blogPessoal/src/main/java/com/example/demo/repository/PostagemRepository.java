package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);

	@Query(value = "select * from postagens where ano > 2011", nativeQuery = true)
	List<Postagem> finAllMaior();
	
	@Query(value = "SELECT * from postagens order by ano desc", nativeQuery = true)
	List<Postagem> anoDesc();
	
	@Query(value = "SELECT * FROM postagens ORDER BY ano ASC", nativeQuery = true)
	List<Postagem> anosAsc();
	
	@Query(value = "SELECT * from postagens where ano >= 2011 and ano <=2013", nativeQuery = true)
	List<Postagem> anosIntervalos();
}
