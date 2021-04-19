package estudandojava.godev.bll;

import estudandojava.godev.Common.Response;
import estudandojava.godev.entities.Carro;

public class CarroBLL {
	Carro carro = new Carro();
	
	public Response ligarCarro(Carro carro) {
		Response response = new Response();
		if(!carro.isLigado() && carro.getNivelCombustivel() > 0) {
			carro.setLigado(true);
			response.sucesso = true;
			response.mensagem = "Carro ligado com sucesso.";
		}
		else if(carro.getNivelCombustivel() == 0) {
			response.sucesso = false;
			response.mensagem = "O carro está sem combustível.";
		}
		else {
			response.sucesso = false;
			response.mensagem = "O carro já está ligado.";
			
		}
			return response;
	}
}
