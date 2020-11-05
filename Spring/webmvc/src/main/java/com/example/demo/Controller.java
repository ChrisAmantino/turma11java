package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
public class Controller implements WebMvcConfigurer {
	
	//PARA ACESSAS A PÁGINA PELO LOCALHOST:8080
	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/index.html");
	}
	
	//injetar o repository
	@Autowired
	private ManutencaoRepository repository;
	
	//QUATRO MÉTODOS, GET, POST, PUT E DELETE
	//GET BY ID. BY NOME,
	@GetMapping("/manutencoes")
	public List<ManutencaoTable> buscarTodos(){
		return repository.findAll();
	}
	
	@GetMapping("/manutencoes/{id}")
	public Optional<ManutencaoTable> buscarUm(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@PostMapping("/manutencoes")
	public ManutencaoTable criar(@RequestBody ManutencaoTable objetoManutencao) {
		repository.save(objetoManutencao);
		return objetoManutencao;
	}
	
	@PutMapping("/manutencoes/{id}")
	public ManutencaoTable atualizar(@PathVariable Long id, @RequestBody ManutencaoTable objetinho) {
		objetinho.setId(id);
		repository.save(objetinho);
		return objetinho;
	}
	
	@GetMapping("/manutencoes/teste/{nome}")
	public List<ManutencaoTable> buscarPorNome(@PathVariable String nome) {
		return repository.findByNome(nome);
	}
	
	@GetMapping("/manutencoes/{nome}/{categoria}")
	public Optional<ManutencaoTable> findByNomeAndCategoria(@PathVariable String nome, @PathVariable String categoria) {
		return repository.findByNomeAndCategoria(nome, categoria);
	}
	
	@DeleteMapping("/manutencoes/delete/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
