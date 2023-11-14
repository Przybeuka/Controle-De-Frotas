package com.cdf.controledefrota.veiculo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.stereotype.Component;

@Component
public class VeiculoDaoService {

	private static List<Veiculo> veiculos = new ArrayList<>();
	
	private int veiculosCount = 3;
	
	static{
		veiculos.add(new Veiculo(1, "Ford", "ADS12321"));
		veiculos.add(new Veiculo(2, "Volvo", "ADS14701"));
		veiculos.add(new Veiculo(3, "Scania", "ADS29582"));
	}
	
	public List<Veiculo> findAll(){
		return veiculos;
	}
	
	public Veiculo save(Veiculo veiculo) {
		if (veiculo.getId()== null) {
			veiculo.setId(++veiculosCount);
		}
		veiculos.add(veiculo);
		return veiculo;
	}
	
	public Veiculo findOne(Integer id) {
		for (Veiculo veiculo:veiculos) {
			if(veiculo.getId() == id) {
				return veiculo;
			}
		}
		return null;
	}
	
	public Veiculo deleteById(Integer id) {
		Iterator<Veiculo> iterator = veiculos.iterator();
		while (iterator.hasNext()) {
			Veiculo veiculo = iterator.next();
			if(veiculo.getId() == id) {
				iterator.remove();
				return veiculo;
			}
		}
		return null;
	}
}
