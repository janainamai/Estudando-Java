package br.com.janaina.devdojo.ZEStreams.test;

import java.util.ArrayList;
import java.util.List;

import br.com.janaina.devdojo.ZEStreams.dominio.Livro;

public class StreamTest08 {
	
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
		// somar todos os pre�os > 3
		livros.stream()
			.filter(l -> l.getPreco() > 3)
			.map(Livro::getPreco)
			.reduce(Double::sum)
			.ifPresent(System.out::println);
		
		// trabalhando com tipos primitivos
		double sum = livros.stream()
			.filter(l -> l.getPreco() > 3)
			.mapToDouble(Livro::getPreco)
			.sum();
		
		System.out.println(sum);
	}
}
 