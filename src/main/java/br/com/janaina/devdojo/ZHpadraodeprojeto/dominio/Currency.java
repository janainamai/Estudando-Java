package br.com.janaina.devdojo.ZHpadraodeprojeto.dominio;

public interface Currency {
	String getSymbol();
}

class Real implements Currency {
	@Override
	public String getSymbol() {
		return "R$";
	}
}

class UsDollar implements Currency {
	@Override
	public String getSymbol() {
		return "$";
	}
}