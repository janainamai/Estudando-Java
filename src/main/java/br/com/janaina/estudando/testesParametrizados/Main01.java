package br.com.janaina.estudando.testesParametrizados;

public class Main01 {
	public static void main(String[] args) {
		Carteira carteira = new Carteira(10L);
		EnumOperacaoEfetuada resultado = Pagamento.pagarContaImpl(carteira, EnumTipoPagamento.PIX, 40);
		System.out.println(resultado + ": " + carteira.getValor());
		
	}
}
