package br.com.janaina.devdojo.ZEStreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

// 1. ordenar Livros por t�tulo
// 2. trazer os primeiros 3 primeiros t�tulos dos livros que tenham o pre�o menor do que 4
public class StreamTest04 {
	
	public static void main(String[] args) {
		List<List<String>> escola = new ArrayList<>();
		List<String> professores = new ArrayList<>(List.of("Nodji", "Carlos", "Horas de V�o"));
		List<String> alunos = new ArrayList<String>(List.of("Janaina", "Jonata", "Vanderlei"));
		List<String> patrocinadores = new ArrayList<>(List.of("Senior Sistemas", "Proway"));
		escola.add(professores);
		escola.add(alunos);
		escola.add(patrocinadores);
		
		// como imprimir os elementos dessa lista utilizando Java sem ser a vers�o 8
		// quero todos os nomes das pessoas que est�o dentro da escola (f�sica ou jur�dica)
		
		for (List<String> pessoas : escola) {
			for (String pessoa : pessoas) {
				System.out.println(pessoa);
			}
		}
		
		// como ficaria esse c�digo com FlatMap
		// se utilizarmos o map, ele nos retorna um Stream<Stream<String>>
		Stream<Stream<String>> map = escola.stream().map(Collection::stream);
		// se utilizarmos o FlatMap, ele vai mais a fundo e nos retorna um Stream<String>
		Stream<String> flatMap = escola.stream().flatMap(Collection::stream);
		
		// podemos direto coletar os valores e imprim�-los
		escola.stream().flatMap(Collection::stream).forEach(System.out::println);
		

	}
}
