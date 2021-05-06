package br.com.janaina.devdojo.Jdatas;

import java.util.Locale;

public class DlocaleISOs {
	public static void main(String[] args) {
		String[] isoCountries = Locale.getISOCountries();
		String[] isoLanguages = Locale.getISOLanguages();
		
		for(String isoC : isoCountries) {
			System.out.print(isoC + " ");
		}
		
		System.out.println();
		
		for(String isoL : isoLanguages) {
			System.out.print(isoL + " ");
		}
	}

}
