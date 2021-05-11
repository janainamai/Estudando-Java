package br.com.janaina.devdojo.Jdatas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/**
 * Classe que me fornece qual será o próximo dia útil.
 * @author janainamai
 *
 */
class ObterProximoDiaUtil implements TemporalAdjuster {

	@Override
	public Temporal adjustInto(Temporal temporal) {
		DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
		int addDays;
		switch (dayOfWeek) {
		case FRIDAY:
			addDays = 3;
			break;
		case SATURDAY:
			addDays = 2;
			break;
		default:
			addDays = 1;
		}
		return temporal.plus(addDays, ChronoUnit.DAYS);
	}

}

public class KTemporalAdjuster {
	public static void main(String[] args) {
		// data de hoje normal
		LocalDate now = LocalDate.now();
		System.out.println(now + " " + now.getDayOfWeek());
		
		now = LocalDate.now().with(new ObterProximoDiaUtil());
		System.out.println(now.getDayOfWeek());
		
		now = LocalDate.now().withDayOfMonth(10).with(new ObterProximoDiaUtil());
		System.out.println(now.getDayOfWeek());

	}
}
