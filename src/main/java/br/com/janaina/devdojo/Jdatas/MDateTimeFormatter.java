package br.com.janaina.devdojo.Jdatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MDateTimeFormatter {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		//saída: 20210511
		
		String s2 = date.format(DateTimeFormatter.ISO_DATE);
		//saída: 2021-05-11
		
		String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		//saída: 2021-05-11
		
		//formatando de String para objeto
		LocalDate.parse("20210511", DateTimeFormatter.BASIC_ISO_DATE);
		//saída: 2021-05-11
		
		//formatando data atual para BASIC_ISO_DATE com horas
		LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE);
		//saída: 2021-05-11T17:29:55.1121294
		
		//formatando para modelo desejado, ex: Brasil
		DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate.now().format(formatterBR);
		//saída: 11/05/2021
		
		//outro exemplo:
		DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy");
		LocalDate.now().format(formatterGR);
		//saída: 11.maio.2021
		
		//formatando do modelo Brasil para LocalDate
		LocalDate.parse("11/05/2021", formatterBR);
		//saída: 2021-05-11
		
		
	}

}
