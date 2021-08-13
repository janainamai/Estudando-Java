package br.com.janaina.devdojo.ZBClassesInternasiParametrizandoComp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest3 {
	private static List<Carro> carros = List.of(new Carro("verde", 2011), new Carro("preto", 1998),
			new Carro("vermelho", 2019));

	public static void main(String[] args) {
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		filtrar(numeros, num -> num % 2 == 0);
	}

	private static <T> List<T> filtrar(List<T> list, Predicate<T> predicate) {
		List<T> listaFiltrada = new ArrayList<T>();
		for (T t : list) {
			if(predicate.test(t))
				listaFiltrada.add(t);
		}
		return listaFiltrada;
	}

}
