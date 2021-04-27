package br.com.janaina.estudando.padraoDeProjeto.Dprototype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Console {
	public static void main(String[] args) {
		List<Forma> formas = new ArrayList<Forma>();
		List<Forma> formasCopia = new ArrayList<Forma>();

		Circulo circulo = new Circulo();
		circulo.x = 10;
		circulo.y = 20;
		circulo.raio = 15;
		circulo.color = "vermelha";
		formas.add(circulo);

		Circulo outroCirculo = (Circulo) circulo.clone();
		formas.add(outroCirculo);

		Retangulo retangulo = new Retangulo();
		retangulo.altura = 10;
		retangulo.largura = 20;
		retangulo.color = "azul";
		formas.add(retangulo);

		clonarEComparar(formas, formasCopia);
	}

	private static void clonarEComparar(List<Forma> formas, List<Forma> formasCopia) {
		for (Forma forma : formas) {
			formasCopia.add(forma.clone());
		}

		for (int i = 0; i < formas.size(); i++) {
			if (formas.get(i) != formasCopia.get(i)) {
				System.out.println(i + ": formas são diferentes objetos!");
				if (formas.get(i).equals(formasCopia.get(i))) {
					System.out.println(i + ": e eles são identicos!");
				} else {
					System.out.println(i + ": e eles não são identicos!");
				}

			} else {
				System.out.println(i + ": e eles são identicos!");
			}
		}
	}
}
