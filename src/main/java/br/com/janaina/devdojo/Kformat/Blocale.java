package br.com.janaina.devdojo.Kformat;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Blocale {
	public static void main(String[] args) {

		// setando pa�ses no Locale
		Locale localeBrasil = new Locale("pt", "BR");
		Locale localeItalia = new Locale("it", "IT");
		Locale localeHolanda = new Locale("nl", "NL");

		Calendar calendar = Calendar.getInstance();
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItalia);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

		// pegamos data completa do pa�s setado no Locale
		System.out.println("Brasil : " + df1.format(calendar.getTime()));
		System.out.println("It�lia : " + df2.format(calendar.getTime()));
		System.out.println("Holanda: " + df3.format(calendar.getTime()));
		
		System.out.println();

		// traduzindo os nomes de acordo com a linguagem setada no pc atual
		System.out.println("Pa�s: " + localeBrasil.getDisplayCountry());
		System.out.println("Pa�s: " + localeItalia.getDisplayCountry());
		System.out.println("Pa�s: " + localeHolanda.getDisplayCountry());
		
		System.out.println();
		
		// definir no par�metro a linguagem que queremos usar ao imprimir a informa��o
		System.out.println(localeHolanda.getDisplayCountry(localeHolanda));
		
		System.out.println();
		
		// consultar linguagem do sistema do usu�rio
		System.out.println(Locale.getDefault());
	}
}
