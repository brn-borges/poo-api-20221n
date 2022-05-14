package br.edu.fatecfranca.apidb.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.apidb.model.Pokemon;

// a classe interface vai herdar de outra classe interface
public interface PokemonRepository extends JpaRepository<Pokemon, Long>{
	//esta interface vai herdar os metodos de crud
	//c - create - insert
	//r - retrieve -select
	//u - update - update
	//d - delete - delete
}
