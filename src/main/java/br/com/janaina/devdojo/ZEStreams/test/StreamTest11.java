package br.com.janaina.devdojo.ZEStreams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import br.com.janaina.devdojo.ZEStreams.dominio.Livro;

public class StreamTest11 {
	private static List<Livro> livros = new ArrayList<>(
		List.of(new Livro("Percy Jackson e o Ladr�o de Raios", 2), 
				new Livro("Alice no Pa�s das Maravilhas", 2),
				new Livro("Harry Potter e o C�lice de Fogo", 5),
				new Livro("Os Imoralistas", 3), 
				new Livro("O Colecionador", 6),
				new Livro("Ansiedade, o Mal do S�culo", 2), 
				new Livro("O Dilema do Porco Espinho", 1)));
	
	public static void main(String[] args) {
		// com streams e count
		livros.stream().count();
		// com collect
		livros.stream().collect(Collectors.counting());
		
		// com streams e max
		livros.stream()
			.max(Comparator.comparing(Livro::getTitulo))
			.ifPresent(System.out::println);
		// com collect
		livros.stream()
			.collect(Collectors.maxBy(Comparator.comparing(Livro::getTitulo)))
			.ifPresent(System.out::println);

		//somando
		// com streams e mapToDouble
		livros.stream().mapToDouble(Livro::getPreco).sum();
		// com collect
		livros.stream()
			.collect(Collectors.summingDouble(Livro::getPreco));
		
		// m�dia
		// com streams e mapToDouble
		livros.stream().mapToDouble(Livro::getPreco).average();
		// com collect
		livros.stream()
			.collect(Collectors.averagingDouble(Livro::getPreco));
		
		DoubleSummaryStatistics collect = livros
					.stream()
					.collect(Collectors.summarizingDouble(Livro::getPreco));
		
		System.out.println(collect);
		
		// juntando coisas com joining
		String titulos = livros.stream().map(Livro::getTitulo).collect(Collectors.joining(", "));
		
		System.out.println(titulos);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
