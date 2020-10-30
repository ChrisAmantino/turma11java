package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String obj() {
		return "Meus objetivos da semana são compreender a matéria que está sendo aplicada e concluir todas as atividades com sucesso!";
	}

}
