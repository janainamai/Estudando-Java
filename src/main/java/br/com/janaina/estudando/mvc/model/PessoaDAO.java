package br.com.janaina.estudando.mvc.model;

public class PessoaDAO implements ICRUD<Pessoa> {
	public void cadastrar(Pessoa pessoa) {
		// aqui ocorre contato com banco de dados para cadastrar a pessoa
	}

	public Pessoa pegarPorID(int id) {
		Pessoa pessoa = new Pessoa(); // aqui ocorre contato com banco de dados para retornar um objeto do tipo Pessoa
		return pessoa;
	}

}
