package br.com.janaina.devdojo.Jdatas;

import java.util.Calendar;
import java.util.Date;

public class Bcalendar {
	public static void main(String[] args) {
	Calendar c = Calendar.getInstance();
	System.out.println(c.getTime());
	System.out.println(c.get(Calendar.YEAR));
	System.out.println(c.get(Calendar.MONTH));
	System.out.println(c.get(Calendar.DAY_OF_MONTH));
	
	System.out.println();
	
	c.getFirstDayOfWeek();
	System.out.println(Calendar.DAY_OF_WEEK); 
	System.out.println(Calendar.DAY_OF_MONTH);
	System.out.println(Calendar.DAY_OF_YEAR);
	System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);
	
	System.out.println();
	
	
	
	
	}
}
