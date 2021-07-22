package br.com.janaina.devdojo.Rcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EsortingList {
	public static void main(String[] args) {
		
	 List<String> nomes = new ArrayList<>(6);
	    nomes.add("Armando");
	    nomes.add("Daniel");
	    nomes.add("Carlos");
	    nomes.add("Zilda");
	    nomes.add("Beatriz");
	    nomes.add("Roberto");
	        
	    // String: organiza a lista em ordem alfabética
	    // números: organiza em ordem crescente
	    Collections.sort(nomes);

	    for(String nome : nomes) {
	        System.out.println(nome);
	    }
	}
}
