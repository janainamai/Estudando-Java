package br.com.janaina.estudando.injecaoDeDependencia;

import br.com.janaina.estudando.injecaoDeDependencia.interfaces.ISms;

public class SMS implements ISms {
	public void enviar(String mensagem) {
		System.out.println("SMS enviado | Mensagem: " + mensagem);
	}
}
