package br.com.janaina.devdojo.ZClambdas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.janaina.devdojo.ZClambdas.domain.Filme;
import br.com.janaina.devdojo.ZClambdas.services.FilmeComparators;

public class MethodReferenceTest01 {
	public static void main(String[] args) {
		List<Filme> filmes = new ArrayList<>(List.of(
				new Filme("Rei Leão", 5), 
				new Filme("Madagascar", 20), 
				new Filme("Por Água Abaixo", 10)));
		
		Collections.sort(filmes, FilmeComparators::compareByTitle);
		System.out.println(filmes);
		
		Collections.sort(filmes, FilmeComparators::compareByEstoque);
		System.out.println(filmes);
	}
}
