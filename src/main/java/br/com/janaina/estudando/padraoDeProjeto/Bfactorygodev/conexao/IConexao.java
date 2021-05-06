package br.com.janaina.estudando.padraoDeProjeto.Bfactorygodev.conexao;

import br.com.janaina.estudando.padraoDeProjeto.Bfactorygodev.model.entities.IVeiculo;

public interface IConexao {
	public void salvar(IVeiculo veiculo);

	public IVeiculo ler(int id);
}
