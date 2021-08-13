package br.com.janaina.devdojo.ZBClassesInternasiParametrizandoComp.interfaces;

import br.com.janaina.devdojo.ZBClassesInternasiParametrizandoComp.Carro;

public interface CarroPredicate {
	boolean test(Carro carro);
	
//		(parametro) -> <express�o>
//		(Carro carro) -> carro.getColor().equals("verde");
// 		car -> car.getColor().equals("verde");
	
}
