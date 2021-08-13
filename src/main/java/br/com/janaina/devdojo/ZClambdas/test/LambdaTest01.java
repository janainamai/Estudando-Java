package br.com.janaina.devdojo.ZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
	// Interface Consumer: executa uma opera��o e n�o retorna nada

	public static void main(String[] args) {
		List<String> strings = List.of("Janaina", "Mai", "Helo�sa", "Vendel", "Theiss");
		forEach(strings, System.out::println);
	}

	private static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);
		}
	}

}
