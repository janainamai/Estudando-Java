package br.com.janaina.estudando.mvc.controller;

import br.com.janaina.estudando.mvc.model.Casa;
import br.com.janaina.estudando.mvc.model.IDAO;

public class CasaController implements ICasaController{
	
	IDAO<Casa> casaDAO;
	
	public CasaController(IDAO<Casa> casaDAO){
		this.casaDAO = casaDAO;
	}

	public void cadastrarCasa(Casa casa) {
		casaDAO.cadastrar(casa);
	}

	public Casa pegarCasaPorID(int id) {
		Casa casa = casaDAO.pegarPorID(id);
		return casa;
	}

	public void instalarAlarme(Casa casa) {
		casa.setTemAlarme(true);		
	}
	
	

}
