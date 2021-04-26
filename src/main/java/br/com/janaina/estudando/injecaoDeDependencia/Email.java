package br.com.janaina.estudando.injecaoDeDependencia;

import br.com.janaina.estudando.injecaoDeDependencia.interfaces.IEmail;

public class Email implements IEmail {
	public void enviar(String mensagem) {
		System.out.println("Email enviado | Mensagem: " + mensagem);
	}
}
