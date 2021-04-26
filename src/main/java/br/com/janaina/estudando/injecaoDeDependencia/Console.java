package br.com.janaina.estudando.injecaoDeDependencia;

public class Console {
	public static void main(String[] args) {
	Email email = new Email();
	WhatsApp whats = new WhatsApp();
	
	Pessoa pessoa1 = new Pessoa(email);
	pessoa1.avisar("Hoje é segunda-feira.");
	
	Pessoa pessoa2 = new Pessoa(whats);
	pessoa2.avisar("Hoje é segunda-feira");
	}
}

