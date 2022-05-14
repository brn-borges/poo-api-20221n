package br.edu.fatecfranca.apidb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.apidb.model.Pokemon;
import br.edu.fatecfranca.apidb.model.repositories.PokemonRepository;

// informa que a classe responde por requisições restfull
@RestController
public class PokemonController {
	// caracteristica principal do string
	// injeção de dependencia
	// objeto pode utilizar metodos de sua interface sem ser instanciado
	@Autowired
	PokemonRepository injecao;
	
	// metodo get para consultar os pokemons na rota /pokemon
	@GetMapping("/pokemon")
	public List<Pokemon> get(){
		// select * from pokemon
		return injecao.findAll();
	}
	
}
