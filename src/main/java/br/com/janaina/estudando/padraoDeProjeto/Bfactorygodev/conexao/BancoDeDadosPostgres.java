package br.com.janaina.estudando.padraoDeProjeto.Bfactorygodev.conexao;

import br.com.janaina.estudando.padraoDeProjeto.Bfactorygodev.model.dao.PostgreSQLDAO;

public class BancoDeDadosPostgres extends FactoryBancoDeDados {

	public void conectar() {
		this.conexao = new PostgreSQLDAO();
	}
	
}
