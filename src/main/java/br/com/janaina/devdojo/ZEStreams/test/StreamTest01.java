package br.com.janaina.devdojo.ZEStreams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.janaina.devdojo.ZEStreams.dominio.Livro;

// 1. ordenar Livros por t�tulo
// 2. trazer os primeiros 3 primeiros t�tulos dos livros que tenham o pre�o menor do que 4
public class StreamTest01 {
	private static List<Livro> livros = new ArrayList<>(List.of(
			new Livro("Percy Jackson e o Ladr�o de Raios", 2), 
			new Livro("Alice no Pa�s das Maravilhas", 2),
			new Livro("Harry Potter e o C�lice de Fogo", 5),
			new Livro("Os Imoralistas", 3),
			new Livro("O Colecionador", 6),
			new Livro("Ansiedade, o Mal do S�culo", 2),
			new Livro("O Dilema do Porco Espinho", 1)));
	
	public static void main(String[] args) {
		livros.sort(Comparator.comparing(Livro::getTitulo));

		ArrayList<String> titulos = new ArrayList<>();
		
		for (Livro livro : livros) {
			if(livro.getPreco() < 4)
				titulos.add(livro.getTitulo());
			if(titulos.size() == 3)
				break;
		}
		
		for (String titulo : titulos) {
			System.out.println(titulo);
		}
	}
}
