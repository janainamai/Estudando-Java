package br.com.janaina.estudando.padraoDeProjeto.Bfactorygodev.model.dao;

import br.com.janaina.estudando.padraoDeProjeto.Bfactorygodev.conexao.BancoDeDadosMySQL;
import br.com.janaina.estudando.padraoDeProjeto.Bfactorygodev.conexao.IConexao;
import br.com.janaina.estudando.padraoDeProjeto.Bfactorygodev.model.entities.IVeiculo;

public class MySQLDAO implements IConexao {
	String uri = "mysql";
	
	BancoDeDadosMySQL banco = new BancoDeDadosMySQL();

	public void salvar(IVeiculo veiculo) {
		// salva o veiculo da forma mysql
		
		// try
		banco.conectar();
		String query = "INSERT INTO veiculos(marca, modelo) VALUES('" + veiculo.getMarca() + "', '" + veiculo.getModelo() + "')";

		// catch

	}

	public IVeiculo ler(int id) {
		IVeiculo veiculo = null;
		// try
		banco.conectar();
		String query = "SELECT * FROM veiculos WHERE id = " + id;

		// catch
		
		return veiculo;
	}
}
