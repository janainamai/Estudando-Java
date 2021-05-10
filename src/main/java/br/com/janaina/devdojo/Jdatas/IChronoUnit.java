package br.com.janaina.devdojo.Jdatas;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class IChronoUnit {
	public static void main(String[] args) {
		
		LocalDateTime aniversario = LocalDateTime.of(1999, Month.DECEMBER, 7, 18, 45,0);
		
		ChronoUnit.DAYS.between(aniversario, LocalDateTime.now());
		ChronoUnit.WEEKS.between(aniversario, LocalDateTime.now());
		ChronoUnit.MONTHS.between(aniversario, LocalDateTime.now());
		ChronoUnit.YEARS.between(aniversario, LocalDateTime.now());
	}
}
