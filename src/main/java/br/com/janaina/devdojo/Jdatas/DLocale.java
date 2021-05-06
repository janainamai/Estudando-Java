package br.com.janaina.devdojo.Jdatas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DLocale {
	public static void main(String[] args) {
	
	Locale localeBrasil = new Locale("pt", "BR");
	Locale localeItalia = new Locale("it", "IT");
	Calendar calendar = Calendar.getInstance();
	DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
	DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItalia);
	
	System.out.println("Brasil : " + df1.format(calendar.getTime()));
	
	}
}
