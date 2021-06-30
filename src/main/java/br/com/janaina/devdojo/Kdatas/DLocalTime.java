package br.com.janaina.devdojo.Kdatas;

import java.time.LocalTime;

public class DLocalTime {
	public static void main(String[] args) {
		LocalTime time = LocalTime.of(23, 30, 15); // 23:32:12
		LocalTime timeNow = LocalTime.now(); // 12:47:16.655588600
		time.getHour(); // 23
		time.getMinute(); // 30
		time.getSecond(); // 15
		System.out.println(LocalTime.MIN); // 00:00
		System.out.println(LocalTime.MAX); // 23:59:59:9999999999
	}
}
