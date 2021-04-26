package br.com.janaina.estudando.mvc.controller;

import br.com.janaina.estudando.mvc.model.Casa;
import br.com.janaina.estudando.mvc.model.ICRUD;

public class CasaController{
	
	ICRUD<Casa> casaDAO;
	
	public CasaController(ICRUD<Casa> casaDAO){
		this.casaDAO = casaDAO;
	}

	public void cadastrarCasa(Casa casa) {
		casaDAO.cadastrar(casa);
	}

	public Casa pegarCasaPorID(int id) {
		Casa casa = casaDAO.pegarPorID(id);
		return casa;
	}

}
