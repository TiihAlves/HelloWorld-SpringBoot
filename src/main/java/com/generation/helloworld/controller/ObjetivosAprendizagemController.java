package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-aprendizagem")
public class ObjetivosAprendizagemController {

	@GetMapping
	public String objetivosaprendizagem() {
		return "Ecossistema Spring,\n\n Spring Boot\n\n Spring Date\n\n JPA\n\n Hibernate";
	}
}
