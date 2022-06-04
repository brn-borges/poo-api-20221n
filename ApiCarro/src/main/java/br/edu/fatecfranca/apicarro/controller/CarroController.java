package br.edu.fatecfranca.apicarro.controller;

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

import br.edu.fatecfranca.apicarro.model.Carro;
import br.edu.fatecfranca.apicarro.model.repositories.CarroRepository;

@RestController
public class CarroController {
	@Autowired
	CarroRepository injecao;
	
	@GetMapping("/carro")
	@CrossOrigin(origins="*") 
	public List<Carro> get(){
		return injecao.findAll();
	}
	
	@PostMapping("/carro")
	@CrossOrigin(origins="*")
	public Carro add (@RequestBody Carro carro) {
		Carro novoCarro = injecao.save(carro);
		return novoCarro;
	}
	
	@DeleteMapping("/carro/{id}")
	@CrossOrigin(origins="*")
	public String remove(@PathVariable Long id) {
		try { 
			injecao.deleteById(id);
			return "Remoção com sucesso";
		}catch(Exception e) { 
			return "Carro não encontrado para remoção!";
		}
	}
	
	@PutMapping("/carro")
	@CrossOrigin(origins="*")
	public Carro updates (@RequestBody Carro carro) {
		Carro alteradoCarro = injecao.save(carro);
		return alteradoCarro;
	}
}
