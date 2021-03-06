package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Postagem;
import com.example.demo.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping(value = "/maior")
	public ResponseEntity<List<Postagem>> findAllMaior(){
		return ResponseEntity.ok(repository.finAllMaior());
	}
	
	@GetMapping(value = "/ordem")
	public ResponseEntity<List<Postagem>> anoDesc(){
		return ResponseEntity.ok(repository.anoDesc());
	}
	
	@GetMapping(value = "/asc")
	public ResponseEntity<List<Postagem>> anosAsc(){
		return ResponseEntity.ok(repository.anosAsc());
	}
	
	@GetMapping(value = "/intervalo")
	public ResponseEntity<List<Postagem>> anosIntervalor(){
		return ResponseEntity.ok(repository.anosIntervalos());
	}
	
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping
	public ResponseEntity<Postagem> post (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	
	@PutMapping("/atualizar/{id}")
	public Postagem atualizar(@PathVariable Long id, @RequestBody Postagem objeto) {
		objeto.setId(id);
		repository.save(objeto);
		return objeto;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
