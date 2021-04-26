package br.com.janaina.estudando.mvc.model;

public class CasaDAO implements ICRUD<Casa> {

	public void cadastrar(Casa objeto) {
		// aqui ocorre contato com banco de dados para cadastrar uma casa
	}

	public Casa pegarPorID(int id) {
		Casa casa = new Casa();
		// aqui ocorre contato com banco de dados para retornar um objeto do tipo Casa
		return casa;
	}

}
