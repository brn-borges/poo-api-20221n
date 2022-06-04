package br.edu.fatecfranca.apicarro.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.apicarro.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long>{
		//esta interface vai herdar os metodos de crud
		//c - create - insert
		//r - retrieve -select
		//u - update - update
		//d - delete - delete
}

