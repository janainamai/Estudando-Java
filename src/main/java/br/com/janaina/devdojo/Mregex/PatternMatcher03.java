package br.com.janaina.devdojo.Mregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher03 {
	public static void main(String[] args) {
		// \d = todos os números/dígitos
		// \D = tudo o que não for número/dígitos
		// \s = todos os espaços em branco \t \n \f \r
		// \S = tudo o que não é espaço em branco
		// \w = tudo o que for de a-z, A-Z, números/dígitos ou _
		// \W = tudo menos letras de a-z, A-Z, números/dígitos e _

		// []

		// queremos encontrar no texto tudo o que for 'a', 'b' ou 'c'

		// se eu deixasse 'abc' sem os colchetes, ele procuraria sequências de 'abc'
		// mas com [abc], ele procura ou por 'a', ou por 'b', ou por 'c'
		String regex = "[abcE]";
		String texto = "cafeBABE";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);

		while(matcher.find()) {
			System.out.println(matcher.start() + " " + matcher.group());
		}
		
		// também posso escrever a-z para encontrar todas as letras de 'a' à 'z'
		// exemplo [G-P], procurar todas as letras maiúsculas de 'G' à 'P'
	
	}
}
