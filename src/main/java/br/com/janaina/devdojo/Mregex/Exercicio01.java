package br.com.janaina.devdojo.Mregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio01 {
	public static void main(String[] args) {
		// vamos encontrar números hexadecimais no nosso texto
		// números hexadecimais começam com 0x ou 0X, possuem números e letras de A-F
		
		String regex = "0[xX][0-9a-fA-F]";
		String texto = "12 0x 0xFFABC 0x109 0x1";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		while (matcher.find())
			System.out.println(matcher.start() + " " + matcher.group());
		
		//o problema é que ele não pegou o valor inteiro 0xFFABC, ele só pegou 0xF
		
		
	}
}
