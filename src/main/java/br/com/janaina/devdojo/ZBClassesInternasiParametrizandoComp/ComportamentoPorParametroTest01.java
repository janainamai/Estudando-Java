package br.com.janaina.devdojo.ZBClassesInternasiParametrizandoComp;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
	private static List<Carro> carros = List.of(new Carro("verde", 2011), new Carro("preto", 1998),
			new Carro("vermelho", 2019));

	public static void main(String[] args) {
		System.out.println(filtrarCarroPorCor(carros, "verde"));
		System.out.println(filtrarPorAnoAnteriorAo(carros, 2010));
	}

	private static List<Carro> filtrarCarroPorCor(List<Carro> carros, String cor) {
		List<Carro> carrosList = new ArrayList<Carro>();
		for (Carro carro : carros) {
			if (carro.getCor().equals(cor))
				carrosList.add(carro);
		}
		return carrosList;
	}
	
	private static List<Carro> filtrarPorAnoAnteriorAo(List<Carro> carros, int ano) {
		List<Carro> carrosList = new ArrayList<Carro>();
		for (Carro carro : carros) {
			if (carro.getAno() < ano)
				carrosList.add(carro);
		}
		return carrosList;
	}

}
