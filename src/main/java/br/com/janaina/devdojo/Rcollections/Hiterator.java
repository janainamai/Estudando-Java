package br.com.janaina.devdojo.Rcollections;

import java.util.ArrayList;
import java.util.List;

/**
 * Podemos tentar remover valores de uma List com foreach, mas não é uma boa
 * ideia modificar uma List enquanto ela está em um foearch, pois isso nos gera
 * um erro. Por isso, utilizamos o iterator:
 * 
 * @author Janaina
 *
 */
public class Hiterator {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>(); 
		numeros.add(5); 
		numeros.add(0); 
		numeros.add(1);
		numeros.add(0);
		numeros.add(8);
		
		numeros.removeIf(numero -> numero == 0);
	}
	
}
