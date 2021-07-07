package br.com.janaina.devdojo.Rcollections;

import java.util.ArrayList;
import java.util.List;

public class Dlist {

	public static void main(String[] args) {
		// até a versão 1.4 do Java, as listas eram feitas assim
		List nomes = new ArrayList();
		nomes.add("Janaina");
		nomes.add("Heloísa");
		nomes.add("Joaquim");
		nomes.add(12);
		nomes.remove(3);
		nomes.remove("Joaquim");

		for (Object nome : nomes) {
			System.out.println(nome);
		}

		// a partir da versão 1.5 do Java, as listas eram definidas com Generics
		// não conseguimos criar uma lista de tipos primitivos, sempre de objetos
		List<String> sobrenomes = new ArrayList();
		sobrenomes.add("Janaina");
		sobrenomes.add("Heloísa");

		// não podemos adicionar valores dentro de for
		for (String sobrenome : sobrenomes) {
			System.out.println(sobrenome);
		}

		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		// consigo adicionar uma lista inteira em uma lista
		nomes.addAll(sobrenomes);
		System.out.println(nomes);
	}
}
