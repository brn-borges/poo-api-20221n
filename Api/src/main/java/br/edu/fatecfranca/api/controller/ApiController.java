package br.edu.fatecfranca.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//vamos informar que esta classe e responsavel por responder requisções Rest

@RestController
public class ApiController {
	
	// criar serviços beseados no verbo get
	
	//bom dia é o nome da rota
	@GetMapping("/bomdia")
	public String bomDia() {
		return "Bom dia";
	}

	//boa tarde é o nome da rota
	@GetMapping("/boatarde")
	public String boaTarde() {
		return "Boa tarde";
	}
	
	//boa noite é o nome da rota
	@GetMapping("/boanoite/{nome}")
	public String boaNoite(@PathVariable String nome) {
		return "Boa Noite " + nome;
	}
	
	
}
