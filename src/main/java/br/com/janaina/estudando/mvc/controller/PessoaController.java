package br.com.janaina.estudando.mvc.controller;

import br.com.janaina.estudando.mvc.model.ICRUD;
import br.com.janaina.estudando.mvc.model.Pessoa;
import br.com.janaina.estudando.mvc.model.PessoaDAO;

public class PessoaController implements ICRUD<Pessoa> {
	PessoaDAO pessoaDAO = new PessoaDAO();
	
	public void cadastrar(Pessoa pessoa) {
		pessoaDAO.cadastrar(pessoa);
	}

	public Pessoa pegarPorID(int id) {
		Pessoa pessoa = pessoaDAO.pegarPorID(id);
		return pessoa;
	}

}
