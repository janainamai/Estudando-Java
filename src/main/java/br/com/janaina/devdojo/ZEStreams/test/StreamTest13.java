package br.com.janaina.devdojo.ZEStreams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.janaina.devdojo.ZEStreams.dominio.Categoria;
import br.com.janaina.devdojo.ZEStreams.dominio.Livro;
import br.com.janaina.devdojo.ZEStreams.dominio.Promotion;

public class StreamTest13 {
	private static List<Livro> livros = new ArrayList<>(
		List.of(new Livro("Percy Jackson e o Ladr�o de Raios", 2, Categoria.FANTASIA), 
				new Livro("Alice no Pa�s das Maravilhas", 2, Categoria.FANTASIA),
				new Livro("Harry Potter e o C�lice de Fogo", 5, Categoria.FANTASIA),
				new Livro("Os Imoralistas", 3, Categoria.ROMANCE), 
				new Livro("O Colecionador", 6, Categoria.DRAMA),
				new Livro("Ansiedade, o Mal do S�culo", 2, Categoria.PSICOLOGIA), 
				new Livro("O Dilema do Porco Espinho", 1, Categoria.PSICOLOGIA)));
	
	public static void main(String[] args) {
	// pre�o < 6 promotion
	// pre�o > 6 no promotion 
		
		// separar livros conforme pre�o, distribuindo em categorias de com ou sem promo��o 
		Map<Promotion, List<Livro>> collect = livros.stream()
			.collect(Collectors.groupingBy(livro ->
				livro.getPreco() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
			));
		
		System.out.println(collect);
		System.out.println(" ");
		
		// agrupar por categoria e por promo��o
		Map<Categoria, Map<Promotion, List<Livro>>> collect2 = livros
				.stream().collect(Collectors.groupingBy(Livro::getCategoria,
				Collectors.groupingBy(livro -> livro.getPreco() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
			)));
		
		System.out.println(collect2);
		
		
	}
	
}
