package br.com.janaina.estudando.injecaoDeDependencia;

import br.com.janaina.estudando.injecaoDeDependencia.interfaces.IWhatsApp;

public class WhatsApp implements IWhatsApp {
		public void enviar(String mensagem) {
			System.out.println("What's App enviado | Mensagem: " + mensagem);
		}
}
