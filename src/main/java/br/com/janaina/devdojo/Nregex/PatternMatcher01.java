package br.com.janaina.devdojo.Nregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher01 {
	public static void main(String[] args) {
		String regex = "ab";
		String texto = "abaaba";
		
		//o padrão que desejo procurar
		Pattern pattern = Pattern.compile(regex);
		
		//quero que meu padrão encontre ele mesmo neste texto
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto: " + texto);
		System.out.println("regex: " + regex);
		
		//o comando abaixo irá me mostrar a posicao da string onde ele localizou o regex 'ab'
		System.out.println();
		
		while(matcher.find())
			System.out.println(matcher.start() + " " + matcher.group());
		//ele encontrou 'ab' nas posicoes 0 e 3 do 'texto'
		
		//se o texto fosse abababa, ele responderia que encontrou nas posições 0 e 4, ignoraria a posicao 2
		
	}
}
