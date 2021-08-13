package br.com.janaina.devdojo.ZEStreams.test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
	public static void main(String[] args) {
		// imprimindo todos os n�meros �mpares, 
		// come�ando com 1
		// limitando mostrar at� 10 n�meros 
		Stream.iterate(1, n -> n + 2) 
			.limit(10)
			.forEach(System.out::println);
		
		// imprimindo sequ�ncia de fibonacci
		Stream.iterate(new int[] {0,1}, n -> new int[] {n[1], n[0] + n[1]})
			.limit(13)
			.map(a -> a[0])
			.forEach(System.out::println);
		
		// imprimindo 100 n�meros aleat�rios de 1 a 500
		ThreadLocalRandom random = ThreadLocalRandom.current();
		Stream.generate(() -> random.nextInt(1, 500))
			.limit(100)
			.forEach(System.out::println);
	}
}
 