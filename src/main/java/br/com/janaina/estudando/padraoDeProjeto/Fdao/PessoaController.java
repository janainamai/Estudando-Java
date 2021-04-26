package br.com.janaina.estudando.padraoDeProjeto.Fdao;

public class PessoaController {
	public Pessoa getPessoaPorID(int id) {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.get(id);
		return pessoa;
	}

}
