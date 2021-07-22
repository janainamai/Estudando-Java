package br.com.janaina.devdojo.Rcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GconversaoListEArray {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);

		// Convertendo um ArrayList em um Array:
		// desta forma, retorna um Array de objetos, o que não é muito interessante
		numeros.toArray();

		// desta forma, escolhemos o tipo de objeto que queremos na lista gerada
		// setamos zero pois dessa forma o Java descobre o tamanho do Array que ele
		// precisa criar
		Integer[] integerArray = numeros.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integerArray));
	}
}
