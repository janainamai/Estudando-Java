package br.com.janaina.devdojo.ZBClassesInternas;

class Animal {
	public void andar() {
		System.out.println("Animal andando...");
	}
}

class Cachorro extends Animal {
	@Override
	public void andar() {
		System.out.println("Cachorro andando...");
	}
}

public class ClasseAnonima {
	public static void main(String[] args) {
		Animal animal = new Animal() {
			@Override
			public void andar() {
				System.out.println("Andando nas sombras...");
				ligarLanterna();
			}
			
			public void ligarLanterna() {
				System.out.println("Ligando lanterna...");
			}
		};
		animal.andar();
	}
}
