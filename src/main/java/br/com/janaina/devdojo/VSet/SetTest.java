package br.com.janaina.devdojo.VSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<Integer> numeros = new LinkedHashSet<>();
		numeros.add(5);
		numeros.add(0);
		numeros.add(1);
		numeros.add(0);
		numeros.add(8);
		
		System.out.println(numeros);
	}
}
