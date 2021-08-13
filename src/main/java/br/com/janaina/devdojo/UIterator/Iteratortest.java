package br.com.janaina.devdojo.UIterator;

import java.util.ArrayList;
import java.util.List;

public class Iteratortest {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>(); 
		numeros.add(5); 
		numeros.add(0); 
		numeros.add(1);
		numeros.add(0);
		numeros.add(8);
		
		numeros.removeIf(numero -> numero == 0);
		
		System.out.println(numeros);
	}
}
