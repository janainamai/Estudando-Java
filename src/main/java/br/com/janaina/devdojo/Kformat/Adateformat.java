package br.com.janaina.devdojo.Kformat;

import java.text.DateFormat;
import java.util.Calendar;

public class Adateformat {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); 
		DateFormat[] dateFormat = new DateFormat[7]; 

		dateFormat[0] = DateFormat.getInstance(); 
		dateFormat[1] = DateFormat.getDateInstance(); 
		dateFormat[2] = DateFormat.getDateTimeInstance(); 
		dateFormat[3] = DateFormat.getDateInstance(DateFormat.SHORT); 
		dateFormat[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); 
		dateFormat[5] = DateFormat.getDateInstance(DateFormat.LONG); 
		dateFormat[6] = DateFormat.getDateInstance(DateFormat.FULL); 

		for(DateFormat dateF : dateFormat) { 
		System.out.println(dateF.format(calendar.getTime())); 
		} 
	}
}
