package br.com.janaina.devdojo.Kdatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ElocalDateTime {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		
		// assim como outras classes, podemos obter diversos dados como os abaixo e muito mais
		dateTime.getHour();
		dateTime.getMinute();
		dateTime.getSecond();
		dateTime.getDayOfMonth();
		
		System.out.println(dateTime);
		
		// podemos fazer a junção de uma data com uma hora
		LocalDate data = LocalDate.parse("2021-05-10");
		LocalTime hora = LocalTime.parse("09:30");
		
		LocalDateTime localDateTime = data.atTime(hora);
		LocalDateTime localDateTime2 = hora.atDate(data);
		
		// saída: 2021-05-10T09:30
	}
}
