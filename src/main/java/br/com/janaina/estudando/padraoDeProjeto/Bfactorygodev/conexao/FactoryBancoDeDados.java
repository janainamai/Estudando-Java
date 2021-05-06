package br.com.janaina.estudando.padraoDeProjeto.Bfactorygodev.conexao;

import br.com.janaina.estudando.padraoDeProjeto.Bfactorygodev.model.entities.IVeiculo;

public abstract class FactoryBancoDeDados {
	IConexao conexao;
	
	public abstract void conectar();
	
	public void salvarNoBanco(IVeiculo veiculo) {
		this.conexao.salvar(veiculo);
	}
	
	public IVeiculo lerNoBanco(int id) {
		IVeiculo veiculo = this.conexao.ler(id);
		return veiculo;
	}
}
