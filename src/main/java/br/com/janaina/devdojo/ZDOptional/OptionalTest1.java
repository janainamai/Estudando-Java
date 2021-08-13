package br.com.janaina.devdojo.ZDOptional;

import java.util.List;
import java.util.Optional;

public class OptionalTest1 {
	public static void main(String[] args) {

		// System.out.println(Optional.of(findName("Marta")));

		// System.out.println(Optional.of("Optional of..."));

		// System.out.println(Optional.ofNullable(findName("Marta")));

		// � como se existisse aqui um if & else
		// caso n�o exista, imprime a mensagem
		
		// Optional<String> nameOptional = Optional.ofNullable(findName("Janaina Mai"));
		Optional<String> nameOptional = findName("Janaina Mai");

		System.out.println(nameOptional.orElse("EMPTY"));
		
		nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));

	}

	private static Optional<String> findName(String name) {
		List<String> nomes = List.of("Janaina Mai", "Ana Mae", "Amanda Mailson");
		int index = nomes.indexOf(name);
		if (index != -1) {
			return Optional.of(nomes.get(index));
		}
		return Optional.empty();
	}
}
