package br.com.janaina.devdojo.ZEStreams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.janaina.devdojo.ZEStreams.dominio.Livro;

public class StreamTest06 {
	
	private static List<Livro> livros = new ArrayList<>(List.of(
			new Livro("Percy Jackson e o Ladr�o de Raios", 2), 
			new Livro("Alice no Pa�s das Maravilhas", 2),
			new Livro("Alice no Pa�s das Maravilhas", 2),
			new Livro("Harry Potter e o C�lice de Fogo", 5),
			new Livro("Os Imoralistas", 3),
			new Livro("O Colecionador", 6),
			new Livro("Ansiedade, o Mal do S�culo", 2),
			new Livro("O Dilema do Porco Espinho", 1)));
	
	public static void main(String[] args) {
		// existe algum livro que possui o pre�o maior do que 5?
		
//		System.out.println(livros.stream().anyMatch(livro -> livro.getPreco() > 5));
//		System.out.println(livros.stream().allMatch(livro -> livro.getPreco() > 3));
//		System.out.println(livros.stream().noneMatch(livro -> livro.getPreco() == 0));
		
//		livros.stream()
//			.filter(livro -> livro.getPreco() < 3) // buscando todos os livros com pre�o maior que 3
//			.findFirst() 							   // pega qualquer um
//			.ifPresent(System.out::println); 	   // imprime
		
		livros.stream()
			.filter(livro -> livro.getPreco() < 3) 			// buscando todos os livros com pre�o < 3
			.sorted(Comparator.comparing(Livro::getPreco))  // ordenando lista por pre�o
			.findFirst() 						   			// pega o primeiro encontrado
			.ifPresent(System.out::println); 	   			// imprime
		
		
	}
}
