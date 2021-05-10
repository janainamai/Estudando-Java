package br.com.janaina.devdojo.Jdatas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gduration {
	public static void main(String[] args) {
	LocalDateTime now = LocalDateTime.now();
	LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
	LocalTime timeNow = LocalTime.now();
	LocalTime timeMinutes7Hours = LocalTime.now().plusHours(7);
	
	Duration duration1 = Duration.between(now, nowAfterTwoYears); 
	System.out.println(duration1);
	
	Duration duration2 = Duration.between(timeNow, timeMinutes7Hours);
	System.out.println(duration2);
	}
}
