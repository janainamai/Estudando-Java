package br.com.janaina.devdojo.ZEStreams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.janaina.devdojo.ZEStreams.dominio.Categoria;
import br.com.janaina.devdojo.ZEStreams.dominio.Livro;

public class StreamTest12 {
	private static List<Livro> livros = new ArrayList<>(
		List.of(new Livro("Percy Jackson e o Ladr�o de Raios", 2, Categoria.FANTASIA), 
				new Livro("Alice no Pa�s das Maravilhas", 2, Categoria.FANTASIA),
				new Livro("Harry Potter e o C�lice de Fogo", 5, Categoria.FANTASIA),
				new Livro("Os Imoralistas", 3, Categoria.ROMANCE), 
				new Livro("O Colecionador", 6, Categoria.DRAMA),
				new Livro("Ansiedade, o Mal do S�culo", 2, Categoria.PSICOLOGIA), 
				new Livro("O Dilema do Porco Espinho", 1, Categoria.PSICOLOGIA)));
	
	public static void main(String[] args) {
	// vamos separar os livros em lista por Categoria
		Map<Categoria, List<Livro>> collect = livros.stream()
				.collect(Collectors.groupingBy(Livro::getCategoria));
	}
}
