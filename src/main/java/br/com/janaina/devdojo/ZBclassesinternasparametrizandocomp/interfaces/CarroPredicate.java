package br.com.janaina.devdojo.ZBclassesinternasparametrizandocomp.interfaces;

import br.com.janaina.devdojo.ZBclassesinternasparametrizandocomp.Carro;

public interface CarroPredicate {
	boolean test(Carro carro);
	
//		(parametro) -> <express�o>
//		(Carro carro) -> carro.getColor().equals("verde");
// 		car -> car.getColor().equals("verde");
	
}
