package com.cdf.controledefrota;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.cdf.controledefrota.veiculo.Veiculo;
import com.cdf.controledefrota.veiculo.VeiculoDaoService;

public class TestVeiculoDao{

	@Test
	public void testVeiculoDao() {
		Integer identifier = 5;
		String marca = "Corsa";
		String placa = "AFR1324";
		
		Veiculo veiculoEsperado = new Veiculo(identifier, marca, placa);
		VeiculoDaoService service = new VeiculoDaoService();
		service.save(veiculoEsperado);
		Veiculo veiculoEncontrado = new Veiculo();
		veiculoEncontrado = service.findOne(identifier);
		assertEquals(identifier, veiculoEncontrado.getId());
		assertEquals(marca, veiculoEncontrado.getMarca());
		assertEquals(placa, veiculoEncontrado.getPlaca());
	}
}