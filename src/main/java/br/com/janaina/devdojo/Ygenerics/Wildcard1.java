package br.com.janaina.devdojo.Ygenerics;

import java.util.List;

public class Wildcard1 {
	private static void imprimirConsulta(List<? super Animal> animais) {
		for (Object objeto : animais)
			((Animal) objeto).consultar();
	}

	public static void main(String[] args) {
		List<Gato> gatos = List.of(new Gato(), new Gato());
		List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());

		List<Animal> animals = List.of();

		imprimirConsulta(animals);

	}
}

abstract class Animal {
	public abstract void consultar();
}

class Cachorro extends Animal {

	@Override
	public void consultar() {
		System.out.println("Consultando doguinho");
	}
}

class Gato extends Animal {

	@Override
	public void consultar() {
		System.out.println("Consultando gatinho");

	}

}