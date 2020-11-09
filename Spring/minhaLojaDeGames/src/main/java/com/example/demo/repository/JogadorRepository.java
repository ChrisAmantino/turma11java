package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Long>{
	

}
