package br.com.janaina.devdojo.ZHpadraodeprojeto.test;

import br.com.janaina.devdojo.ZHpadraodeprojeto.dominio.Person;

public class BuilderPatternTest01 {
	public static void main(String[] args) {
		Person person = new Person.PersonBuilder()
			.firstName("Janaina")
			.lastName("Mai")
			.username("janainamai")
			.email("janainamai@hotmail.com")
			.build();
		
		System.out.println(person);
	}
}
 