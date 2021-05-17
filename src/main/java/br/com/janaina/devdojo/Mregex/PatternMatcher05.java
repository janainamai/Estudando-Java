package br.com.janaina.devdojo.Mregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher05 {
	public static void main(String[] args) {
		String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
		String texto = "janainamai@hotmail.com, helo_blu@outlook.com, jerusamai10@gmail.com, gustavo.loes@yahoo.com.br";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);

		while (matcher.find()) {
			System.out.println(matcher.start() + " " + matcher.group());
		}

		// aqui estamos apenas procurando por padrões, para validar por exemplo um CPF
		// em string, fazemos da seguinte forma:
		
		String email = "helo_blu@outlook.com";
		String email2 = "janainamai@hotmail.com";
		
		if(email.matches(regex))
			System.out.println(email);
		
		if(email2.matches(regex))
			System.out.println(email2);
	}
}
