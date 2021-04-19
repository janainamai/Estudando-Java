package estudandojava.godev.bll;

import static org.junit.Assert.*;

import org.junit.Test;

import estudandojava.godev.Common.Response;
import estudandojava.godev.entities.Carro;

public class CarroBLLTest {
	CarroBLL carroBLL = new CarroBLL();

	@Test
	public void testLigarCarro() {
		Carro carro = new Carro(1.0, 5, 0, false);
		Response response = carroBLL.ligarCarro(carro);
		assertTrue(response.sucesso);
		assertEquals(response.mensagem, "Carro ligado com sucesso.");
	}

}
