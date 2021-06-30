package br.com.janaina.devdojo.Nregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher02 {
	public static void main(String[] args) {
		// \d = todos os números/dígitos
		// \D = tudo o que não for número/dígitos
		// \s = todos os espaços em branco \t \n \f \r
		// \S = tudo o que não é espaço em branco
		// \w = tudo o que for de a-z, A-Z, números/dígitos ou _
		// \W = tudo menos letras de a-z, A-Z, números/dígitos e _
		
		String regex = "\\d";
		String texto = "a6! g51e@rg ae6_h5";
		
		//o padrão que desejo procurar
		Pattern pattern = Pattern.compile(regex);
		
		//quero que meu padrão encontre ele mesmo neste texto
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto: " + texto);
		System.out.println("regex: " + regex);
		
		//o comando abaixo irá me mostrar a posicao da string onde ele localizou o regex 'ab'
		while(matcher.find())
			System.out.println(matcher.start() + " " + matcher.group());
	}
}
