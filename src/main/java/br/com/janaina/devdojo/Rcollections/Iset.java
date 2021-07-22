package br.com.janaina.devdojo.Rcollections;

import java.util.HashSet;
import java.util.Set;

/**
 * Set: não permite elementos duplicados dentro da coleção, verifica através do
 * equals
 * 
 * HashSet: os elementos serão organizados pelo Hash, não tem como garantir como
 * os elementos estarão dentro da lista
 * 
 * LinkedList: é um Array que sabe a posição do elemento e também a próxima
 * posição é melhor para remover elementos
 * 
 * @author Janaina
 *
 */
public class Iset {
	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<>();
		numeros.add(5);
		numeros.add(0);
		numeros.add(1);
		numeros.add(0);
		numeros.add(8);

		System.out.println(numeros);

		// Se quisermor manter a ordem de inserção, devemos utilizar LinkedHashSet
	}
}
