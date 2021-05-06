package br.com.janaina.devdojo.Jdatas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Dlocale {
	public static void main(String[] args) {

		// setando países no Locale
		Locale localeBrasil = new Locale("pt", "BR");
		Locale localeItalia = new Locale("it", "IT");
		Locale localeHolanda = new Locale("nl", "NL");

		Calendar calendar = Calendar.getInstance();
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItalia);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

		// pegamos data completa do país setado no Locale
		System.out.println("Brasil : " + df1.format(calendar.getTime()));
		System.out.println("Itália : " + df2.format(calendar.getTime()));
		System.out.println("Holanda: " + df3.format(calendar.getTime()));
		
		System.out.println();

		// traduzindo os nomes de acordo com a linguagem setada no pc atual
		System.out.println("País: " + localeBrasil.getDisplayCountry());
		System.out.println("País: " + localeItalia.getDisplayCountry());
		System.out.println("País: " + localeHolanda.getDisplayCountry());
		
		System.out.println();
		
		// definir no parâmetro a linguagem que queremos usar ao imprimir a informação
		System.out.println(localeHolanda.getDisplayCountry(localeHolanda));
	}
}
