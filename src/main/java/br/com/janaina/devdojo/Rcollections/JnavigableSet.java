package br.com.janaina.devdojo.Rcollections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class JnavigableSet {
	public static void main(String[] args) {
		NavigableSet<Integer> numeros = new TreeSet<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		
		System.out.println(numeros);
		
		System.out.println("lower: " + numeros.lower(4));
		System.out.println("floor: " + numeros.floor(4));
		System.out.println("higher: " + numeros.higher(4));
		System.out.println("ceiling: " + numeros.ceiling(4));
		
		// Para inverter a ordem da lista, podemos utilizar o descendingSet
		numeros.descendingSet();
	}
}
