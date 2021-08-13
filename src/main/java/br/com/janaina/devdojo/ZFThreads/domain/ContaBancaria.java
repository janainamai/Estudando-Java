package br.com.janaina.devdojo.ZFThreads.domain;

public class ContaBancaria {
	private int saldo = 50;

	public void sacar(int valor ) {
		this.saldo = this.saldo - valor;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
}
