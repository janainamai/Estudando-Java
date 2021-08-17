package br.com.janaina.devdojo.ZHpadraodeprojeto.test;

import br.com.janaina.devdojo.ZHpadraodeprojeto.dominio.Country;
import br.com.janaina.devdojo.ZHpadraodeprojeto.dominio.Currency;
import br.com.janaina.devdojo.ZHpadraodeprojeto.dominio.CurrencyFactory;
 
public class CurrencyFactoryTest01 {
	public static void main(String[] args) {
		
		Currency currency = CurrencyFactory.newCurrency(Country.USA);
		
		System.out.println(currency.getSymbol());
	}
}
