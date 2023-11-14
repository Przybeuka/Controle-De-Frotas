package com.cdf.controledefrota.veiculo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class VeiculoResourse {

	@Autowired
	private VeiculoDaoService service;
	
	@GetMapping("/veiculos")
	public List<Veiculo> retriveAllVeiculos(){
		return service.findAll();
	}
	
	@GetMapping("/veiculos/{id}")
	public Veiculo retriveOneVeiculo(@PathVariable Integer id) {
		return service.findOne(id);
	}
	
	@PostMapping("/veiculos")
	public ResponseEntity<Object> createVeiculo(@RequestBody Veiculo veiculo){
		Veiculo saveVeiculo = service.save(veiculo);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{is}")
				.buildAndExpand(saveVeiculo.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/veiculos/{id}")
	public Veiculo removeVeiculo(@PathVariable Integer id) {
		return service.deleteById(id);
	}
}
