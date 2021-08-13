package br.com.janaina.estudando.testesParametrizados;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class PagamentoTest {

	@ParameterizedTest
	@EnumSource(
			value = EnumTipoPagamento.class, 
			names = { "DEPOSITO", "PIX", "BOLETO", "CHEQUE", "DINHEIRO",
					"CARTAO_DEBITO", "CARTAO_CREDITO" }, 
			mode = EnumSource.Mode.INCLUDE)
	public void testPagarConta(EnumTipoPagamento tipoPagamento) {
		EnumOperacaoEfetuada retorno = Pagamento.pagarConta(tipoPagamento);
		assertEquals("PAGAMENTO_" + tipoPagamento + "_EFETUADO", retorno.toString());
	}
	
	@ParameterizedTest
	@EnumSource(
			value = EnumTipoPagamento.class, 
			names = { "DEPOSITO", "PIX", "BOLETO", "CHEQUE", "DINHEIRO",
					"CARTAO_DEBITO", "CARTAO_CREDITO" }, 
			mode = EnumSource.Mode.EXCLUDE)
	public void testPagarContaDefault(EnumTipoPagamento tipoPagamento) {
		EnumOperacaoEfetuada retorno = Pagamento.pagarConta(tipoPagamento);
		assertEquals("ERRO", retorno.toString());
	}

}
