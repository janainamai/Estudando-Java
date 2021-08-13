package br.com.janaina.devdojo.ZEStreams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import br.com.janaina.devdojo.ZEStreams.dominio.Categoria;
import br.com.janaina.devdojo.ZEStreams.dominio.Livro;

public class StreamTest15 {
	private static List<Livro> livros = new ArrayList<>(
			List.of(new Livro("Percy Jackson e o Ladr�o de Raios", 2, Categoria.FANTASIA),
					new Livro("Alice no Pa�s das Maravilhas", 2, Categoria.FANTASIA),
					new Livro("Harry Potter e o C�lice de Fogo", 5, Categoria.FANTASIA),
					new Livro("Os Imoralistas", 3, Categoria.ROMANCE), new Livro("O Colecionador", 6, Categoria.DRAMA),
					new Livro("Ansiedade, o Mal do S�culo", 2, Categoria.PSICOLOGIA),
					new Livro("O Dilema do Porco Espinho", 1, Categoria.PSICOLOGIA)));

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		long num = 10_000_000;
		somarFor(num);
		somarStreamIterate(num);
		// quanto mais aumentamos as threads, mais demorado fica
		somarParallelStreamIterate(num);
		somarLongStreamIterate(num);
		somarParallelLongStreamIterate(num);
	}

	private static void somarFor(long num) {
		System.out.println("Somando com for");
		long result = 0;
		long init = System.currentTimeMillis();
		for (long i = 1; i <= num; i++) {
			result += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + "ms");
	}
	
	private static void somarStreamIterate(long num) {
		System.out.println("Somando com stream iterate");
		long init = System.currentTimeMillis();
		long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + "ms");
	}
	
	private static void somarParallelStreamIterate(long num) {
		System.out.println("Somando com parallel stream iterate");
		long init = System.currentTimeMillis();
		long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + "ms");
	}
	
	private static void somarLongStreamIterate(long num) {
		System.out.println("Somando com LongStream");
		long init = System.currentTimeMillis();
		long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + "ms");
	}
	
	private static void somarParallelLongStreamIterate(long num) {
		System.out.println("Somando com ParallelLongStream");
		long init = System.currentTimeMillis();
		long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + "ms");
	}
}
