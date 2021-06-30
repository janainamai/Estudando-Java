package br.com.janaina.devdojo.Kdatas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class JTemporalAdjusters {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		now = now.with(ChronoField.DAY_OF_MONTH, 20); // substituindo o dia por 20

		now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY)); 
		// substituindo a data pela próxima sexta-feira
	
		now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
		// substituindo a data pelo último dia do mês
		
		
	}
}
