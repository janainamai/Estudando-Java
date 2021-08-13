package br.com.janaina.devdojo.ZClambdas.test;

import java.util.ArrayList;
import java.util.List;

import br.com.janaina.devdojo.ZClambdas.domain.Filme;
import br.com.janaina.devdojo.ZClambdas.services.FilmeComparators;

public class MethodReferenceTest02 {
	public static void main(String[] args) {
		FilmeComparators filmeComparators = new FilmeComparators();
		
		List<Filme> filmes = new ArrayList<>(List.of(
				new Filme("Rei Leão", 5), 
				new Filme("Madagascar", 20), 
				new Filme("Por Água Abaixo", 10)));
		
		filmes.sort(filmeComparators::compareByEstoqueNonStatic);
	}
}
