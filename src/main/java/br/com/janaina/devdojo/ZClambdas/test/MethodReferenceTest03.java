package br.com.janaina.devdojo.ZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>(List.of("Janaina", "Heloísa", "Alice"));
		nomes.sort(String::compareTo);
	//	System.out.println(nomes);

		Function<String, Integer> stringToInteger = Integer::parseInt;
		stringToInteger.apply("18");
		
		// verificar se tem um elemento dentro de uma lista
		// utilizamos predicate pois retorna um boolean
		// mas para lista, podemos utilizar BiPra
		
		BiPredicate<List<String>, String> checarNome = List::contains;
		System.out.println(checarNome.test(nomes, "Heloísa"));
		
	}
}
