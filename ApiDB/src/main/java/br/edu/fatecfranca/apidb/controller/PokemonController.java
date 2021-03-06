package br.edu.fatecfranca.apidb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@CrossOrigin(origins="*") // permite que api seja consumida de um ip em espefico, nosso caso de qualquer ip.
	public List<Pokemon> get(){
		// select * from pokemon
		return injecao.findAll();
	}
	
	//metodo post para inserir um pokemon na rota /pokemon
	@PostMapping("/pokemon")
	@CrossOrigin(origins="*")
	public Pokemon add (@RequestBody Pokemon pokemon) {
		Pokemon novoPokemon = injecao.save(pokemon);
		return novoPokemon;
	}
	
	//metodo delete para remover um pokemon na tara /pokemon
	@DeleteMapping("/pokemon/{id}")
	@CrossOrigin(origins="*")
	public String remove(@PathVariable Long id) {
		try { // tenta remover
			injecao.deleteById(id);
			return "Remoção com sucesso";
		}catch(Exception e) { //pegar o erro
			return "Pokemon não encontrado para remoção!";
		}
	}
	
	@PutMapping("/pokemon")
	@CrossOrigin(origins="*")
	public Pokemon updates (@RequestBody Pokemon pokemon) {
		Pokemon alteradoPokemon = injecao.save(pokemon);
		//pokemon tera id, portanto o save atualiza
		return alteradoPokemon;
	}
	
	
}
