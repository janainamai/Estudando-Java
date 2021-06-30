package br.com.janaina.devdojo.Nregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher04 {
	public static void main(String[] args) {
//		Exercício 2: Vamos encontrar números hexadecimais no nosso texto 
//		Números hexadecimais começam com 0x ou 0X, possuem números e letras de A-F 

		// quero uma ocorrência que comece com x ou X, com sequências de uma ou mais(+)
		// números de 0 à 9, letras de a à f minúscula ou maiúscula, seguido de um
		// espaco em branco(\\s) ou sendo o fim da linha($)
		String regex = "0[xX]([0-9a-fA-F])+\\s|$";
		String texto = "12 0x 0xFFABC 0x10G 0x1";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);

		while (matcher.find())

			System.out.println(matcher.start() + " " + matcher.group());

	}
}
