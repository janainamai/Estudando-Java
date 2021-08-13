package br.com.janaina.devdojo.ZEStreams.test;

import java.util.ArrayList;
import java.util.List;

import br.com.janaina.devdojo.ZEStreams.dominio.Livro;

// 1. ordenar Livros por t�tulo
// 2. trazer os primeiros 3 primeiros t�tulos dos livros que tenham o pre�o menor do que 4
public class StreamTest03 {
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
		// imprimindo todos os t�tulos dos livros da lista
		// isso � uma m� pr�tica, pois a pr�pria lista possui um forEach
		livros.stream().forEach(l -> System.out.println(l.getTitulo()));
		// forma correta
		livros.forEach(l -> System.out.println(l.getTitulo()));
	
		// queremos contar quantos elementos tem nessa lista com pre�o menor que 4
		long count = livros.stream().filter(l -> l.getPreco() < 4).count();
		System.out.println(count);
		
		// queremos apenas os elementos distintos (tem dois elementos iguais na lista)
		// funciona apenas quando a classe do objeto (Livro) possui equals gerado
		long count2 = livros.stream().distinct().filter(l -> l.getPreco() < 4).count();
		System.out.println(count2);
	}
}
