package br.com.janaina.devdojo.ZBClassesInternasiParametrizandoComp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.janaina.devdojo.ZBClassesInternasiParametrizandoComp.interfaces.CarroPredicate;

public class ComportamentoPorParametroTest2 {
	private static List<Carro> carros = List.of(new Carro("verde", 2011), new Carro("preto", 1998),
			new Carro("vermelho", 2019));

	public static void main(String[] args) {
		List<Carro> carrosVerdes = filtrar(carros, new CarroPredicate() {

			@Override
			public boolean test(Carro carro) {
				return carro.getCor().equals("verde");
			}
			
		});
		System.out.println(carrosVerdes);
	}

	private static List<Carro> filtrar(List<Carro> carros, CarroPredicate carroFiltro) {
		List<Carro> carrosList = new ArrayList<Carro>();
		for (Carro carro : carros) {
			if (carroFiltro.test(carro))
				carrosList.add(carro);
		}
		return carrosList;
	}

	private static List<Carro> filtrarComPredicate(List<Carro> carros, Predicate<Carro> condicao) {
		List<Carro> carrosList = new ArrayList<Carro>();
		for (Carro carro : carros) {
			if (condicao.test(carro))
				carrosList.add(carro);
		}
		return carrosList;
	}

}
