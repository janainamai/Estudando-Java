package br.com.janaina.devdojo.Kformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ESimpleDataFormat {
	public static void main(String[] args) {

	// o que está entre 'apóstrofos' será ignorado pelo format
	String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
	String pattern2 = "'Brasil' dd 'de' MMMM 'de' yyyy";
	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
	
	
	//conversão da nossa data atual para o formato especificado em pattern
	System.out.println(sdf.format(new Date()));
	System.out.println(sdf2.format(new Date()));
	}
}
