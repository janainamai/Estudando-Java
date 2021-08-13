package br.com.janaina.devdojo.ZEStreams.test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
	public static void main(String[] args) {
		// gerando streams de inteiros
		
		// IntStream.range: se pedirmos 1 e 50, ele gera um stream at� 49
		// IntStream.rangeClosed: se pedirmos 1 e 50, ele gera at� 50
		IntStream.rangeClosed(1, 50)
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);
		
		// gerando stream de strings
		Stream.of("Banana", "Laranja", "Mam�o")
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
		int[] numeros = {1, 2, 3, 4, 5};
		Arrays.stream(numeros)
			.average()
			.ifPresent(System.out::println);
		
		// gerando stream de arquivos
		
	}
}
 