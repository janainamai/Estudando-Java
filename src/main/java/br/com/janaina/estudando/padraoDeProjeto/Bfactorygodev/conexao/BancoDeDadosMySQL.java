package br.com.janaina.estudando.padraoDeProjeto.Bfactorygodev.conexao;

import br.com.janaina.estudando.padraoDeProjeto.Bfactorygodev.model.dao.MySQLDAO;

public class BancoDeDadosMySQL extends FactoryBancoDeDados {

	public void conectar() {
		this.conexao = new MySQLDAO();
	}
	
}
