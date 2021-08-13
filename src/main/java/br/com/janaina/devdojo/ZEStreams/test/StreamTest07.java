package br.com.janaina.devdojo.ZEStreams.test;

import java.util.List;

public class StreamTest07 {

	public static void main(String[] args) {
		List<Integer> integers = List.of(1 , 2, 3, 4, 5, 6);
		
		// somando todos os elementos
		// essa opera��o retorna um optional, por isso usamos o ifPresent
		integers.stream().reduce((x, y) -> x + y)
			.ifPresent(System.out::println);
		// multiplicando
		integers.stream().reduce((x, y) -> x * y)
		.ifPresent(System.out::println);
		
		// podemos incializar com 0, para n�o utilizar o optional
		System.out.println(integers.stream().reduce(0,(x, y) -> x + y));
		
		// utilizando method reference
		integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
		
		// buscando o maior valor da lista
		integers.stream().reduce(Integer::max).ifPresent(System.out::println);
	}
}
 