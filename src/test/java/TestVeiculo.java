import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

import com.cdf.controledefrota.veiculo.*;

public class TestVeiculo extends TestCase {

	@Test
	public void testVeiculo() {
		Integer identifier = 5;
		String marca = "Corsa";
		String placa = "AFR1324";
		
		Veiculo veiculoEncontrado = new Veiculo();
		veiculoEncontrado.setId(identifier);
		veiculoEncontrado.setMarca(marca);
		veiculoEncontrado.setPlaca(placa);
		assertEquals(identifier, veiculoEncontrado.getId());
		assertEquals(marca, veiculoEncontrado.getMarca());
		assertEquals(placa, veiculoEncontrado.getPlaca());
	}
}
