package br.com.janaina.devdojo.Jdatas;

import java.time.LocalDate;
import java.time.Month;

public class CLocalDate {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2022, Month.JANUARY, 27);
		System.out.println(date.getYear()); //2022
		System.out.println(date.getMonth()); //JANUARY
		System.out.println(date.getMonthValue()); //1
		System.out.println(date.getDayOfWeek()); //THURSDAY
		System.out.println(date.getDayOfMonth()); //27
		System.out.println(date.lengthOfMonth()); //31
		System.out.println(date.isLeapYear()); //false
		System.out.println(date); //2022-01-27
		
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		// saída: data de hoje 
		
		// podemos adicionar days, weeks, months ou years
		// mas precisamos sempre criar um novo objeto
		LocalDate adicionando = LocalDate.now().plusDays(11).plusMonths(3);
		System.out.println(adicionando);
		// saída: 2021-08-18
		
	}
}
