package br.com.janaina.estudando.mvc.model;

public class Casa {
	private String endereco;
	private int numero;
	private boolean temAlarme;

	public Casa() {
	}

	public Casa(String endereco, int numero, boolean temAlarme) {
		this.endereco = endereco;
		this.numero = numero;
		this.temAlarme = temAlarme;
	}

	public String getendereco() {
		return endereco;
	}

	public void setendereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isTemTelhado() {
		return temAlarme;
	}

	public void setTemAlarme(boolean temAlarme) {
		this.temAlarme = temAlarme;
	}

}
