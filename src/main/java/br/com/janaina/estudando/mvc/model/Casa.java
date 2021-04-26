package br.com.janaina.estudando.mvc.model;

public class Casa {
	private String endere�o;
	private int numero;
	private boolean temAlarme;

	public Casa() {
	}

	public Casa(String endere�o, int numero, boolean temAlarme) {
		this.endere�o = endere�o;
		this.numero = numero;
		this.temAlarme = temAlarme;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
