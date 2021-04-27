package br.com.janaina.estudando.padraoDeProjeto.Fdao;

import java.util.ArrayList;

public class PessoaDAO implements IDAO<Pessoa> {

	public ArrayList<Pessoa> getAll() {
		return null;
	}

	public Pessoa create(Pessoa item) {
		return null;
	}

	public Pessoa get(int id) {
		Pessoa pessoa = new Pessoa();
		return pessoa;
	}

	public boolean update(int id, Pessoa item) {
		return false;
	}

	public boolean remove(int id) {
		return false;
	}
}
