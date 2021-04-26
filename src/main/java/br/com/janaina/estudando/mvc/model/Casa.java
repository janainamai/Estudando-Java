package br.com.janaina.estudando.mvc.model;

public class Casa {
	private String endereço;
	private int numero;
	private boolean temAlarme;

	public Casa() {
	}

	public Casa(String endereço, int numero, boolean temAlarme) {
		this.endereço = endereço;
		this.numero = numero;
		this.temAlarme = temAlarme;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
