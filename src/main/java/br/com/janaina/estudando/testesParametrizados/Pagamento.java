package br.com.janaina.estudando.testesParametrizados;

public class Pagamento {
	
	public static EnumOperacaoEfetuada pagarContaImpl(Carteira carteira, EnumTipoPagamento tipoPagamento, double valor) {
		carteira.addValor(valor);
		switch(tipoPagamento) {
		case DEPOSITO:
			return EnumOperacaoEfetuada.PAGAMENTO_DEPOSITO_EFETUADO;
		case PIX:
			return EnumOperacaoEfetuada.PAGAMENTO_PIX_EFETUADO;
		case BOLETO:
			return EnumOperacaoEfetuada.PAGAMENTO_BOLETO_EFETUADO;
		case CHEQUE:
			return EnumOperacaoEfetuada.PAGAMENTO_CHEQUE_EFETUADO;
		case DINHEIRO:
			return EnumOperacaoEfetuada.PAGAMENTO_DINHEIRO_EFETUADO;
		case CARTAO_CREDITO:
			return EnumOperacaoEfetuada.PAGAMENTO_CARTAO_CREDITO_EFETUADO;
		case CARTAO_DEBITO:
			return EnumOperacaoEfetuada.PAGAMENTO_CARTAO_CREDITO_EFETUADO;
		default:
			return EnumOperacaoEfetuada.ERRO;
		}
	} 
	
	public static EnumOperacaoEfetuada pagarConta(EnumTipoPagamento tipoPagamento) {
		switch(tipoPagamento) {
		case DEPOSITO:
			return EnumOperacaoEfetuada.PAGAMENTO_DEPOSITO_EFETUADO;
		case PIX:
			return EnumOperacaoEfetuada.PAGAMENTO_PIX_EFETUADO;
		case BOLETO:
			return EnumOperacaoEfetuada.PAGAMENTO_BOLETO_EFETUADO;
		case CHEQUE:
			return EnumOperacaoEfetuada.PAGAMENTO_CHEQUE_EFETUADO;
		case DINHEIRO:
			return EnumOperacaoEfetuada.PAGAMENTO_DINHEIRO_EFETUADO;
		case CARTAO_CREDITO:
			return EnumOperacaoEfetuada.PAGAMENTO_CARTAO_CREDITO_EFETUADO;
		case CARTAO_DEBITO:
			return EnumOperacaoEfetuada.PAGAMENTO_CARTAO_DEBITO_EFETUADO;
		default:
			return EnumOperacaoEfetuada.ERRO;
		}
	}
}
