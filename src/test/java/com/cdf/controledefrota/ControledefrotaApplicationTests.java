package com.cdf.controledefrota;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cdf.controledefrota.veiculo.VeiculoResourse;

@SpringBootTest
class ControledefrotaApplicationTests {

	@Autowired
	private VeiculoResourse controller;
	
	@Test
	void contextLoads() throws Exception{
		assertThat(controller).isNotNull();
	}

}
