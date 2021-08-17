package br.com.janaina.devdojo.ZHpadraodeprojeto.test;

import br.com.janaina.devdojo.ZHpadraodeprojeto.dominio.Airplane;
import br.com.janaina.devdojo.ZHpadraodeprojeto.dominio.Country;
import br.com.janaina.devdojo.ZHpadraodeprojeto.dominio.Currency;
import br.com.janaina.devdojo.ZHpadraodeprojeto.dominio.CurrencyFactory;
import br.com.janaina.devdojo.ZHpadraodeprojeto.dominio.Person;
import br.com.janaina.devdojo.ZHpadraodeprojeto.dominio.ReportDto;
import br.com.janaina.devdojo.ZHpadraodeprojeto.dominio.ReportDto.ReportDtoBuilder;

public class DataTransferObjectTest01 {
	public static void main(String[] args) {
		Airplane airplane = new Airplane("777");
		Country country = Country.BRASIL;
		Currency currency = CurrencyFactory.newCurrency(country);
		Person person = new Person.PersonBuilder()
				.firstName("Janaina")
				.lastName("Mai")
				.build();
		
		ReportDtoBuilder reportDto = ReportDto.ReportDtoBuilder
			.build()
			.airplaneName(airplane.getName())
			.country(country)
			.currency(currency)
			.personName(person.getFirstName());
				
		System.out.println(reportDto);
	}
}
