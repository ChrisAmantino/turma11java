package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/softskills")
public class MentalidadesController {
	
	@GetMapping
	public String bsm() {
		return "As Habilidades e Mentalidades que eu utilizei para realizar essa atividade foram:"
				+ "Persistencia, Atenção aos Detalhes e comunicação";
	}

}
