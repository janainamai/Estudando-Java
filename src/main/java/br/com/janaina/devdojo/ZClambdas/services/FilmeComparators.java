package br.com.janaina.devdojo.ZClambdas.services;

import br.com.janaina.devdojo.ZClambdas.domain.Filme;

public class FilmeComparators {
	
	public int compareByEstoqueNonStatic(Filme f1, Filme f2) {
		return Integer.compare(f1.getQuantidadeEstoque(), f2.getQuantidadeEstoque());
	}

	public static int compareByTitle(Filme f1, Filme f2) {
		return f1.getTitulo().compareTo(f2.getTitulo());
	}

	public static int compareByEstoque(Filme f1, Filme f2) {
		return Integer.compare(f1.getQuantidadeEstoque(), f2.getQuantidadeEstoque());
	}

}
