package br.com.janaina.estudando.testesParametrizados;

public class Carteira {
	private double valor;

	public Carteira(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
	
	public void addValor(double valor) {
		this.valor += valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
