package br.com.janaina.devdojo.Jdatas;

import java.time.LocalDate;
import java.time.Period;

public class Hperiod {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);
		
		Period periodo = Period.between(now, nowAfterTwoYears);
		System.out.println(periodo);
	}
}
