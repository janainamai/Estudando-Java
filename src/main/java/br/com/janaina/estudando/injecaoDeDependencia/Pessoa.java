package br.com.janaina.estudando.injecaoDeDependencia;

import br.com.janaina.estudando.injecaoDeDependencia.interfaces.IEnvioDeMensagem;

public class Pessoa {
	IEnvioDeMensagem encaminhamento;

	Pessoa(IEnvioDeMensagem encaminhamento) {
		this.encaminhamento = encaminhamento;
	}

	public void avisar(String msg) {
		this.encaminhamento.enviar(msg);
	}
}
