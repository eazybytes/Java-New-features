/**
 * 
 */
package com.eazybytes.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * @author EazyBytes
 *
 */
public class LocalDateTimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDate date = LocalDate.of(1989, 6, 16);
		LocalTime time = LocalTime.of(12, 30, 10);
		LocalDateTime dateTime = LocalDateTime.of(1989, Month.JUNE, 16, 12, 30, 10);
		System.out.println("The given Date and Time is: "+dateTime);
		LocalDateTime dateTimeVal = LocalDateTime.of(date, time);
		System.out.println(dateTimeVal.getYear());
		System.out.println(dateTimeVal.getMonth());
		System.out.println(dateTimeVal.getDayOfMonth());
		System.out.println(dateTimeVal.getDayOfWeek());
		System.out.println(dateTimeVal.getDayOfYear());
		System.out.println(dateTimeVal.getHour());
		System.out.println(dateTimeVal.getMinute());
		System.out.println(dateTimeVal.getSecond());
		System.out.println(dateTimeVal.getNano());
		System.out.println(dateTimeVal.isAfter(dateTime));
		System.out.println(dateTimeVal.isBefore(dateTime));
		System.out.println(dateTimeVal.isEqual(dateTime));
		System.out.println(dateTimeVal.plusYears(1));
		System.out.println(dateTimeVal.plusWeeks(3));
		System.out.println(dateTimeVal.plusDays(2));
		System.out.println(dateTimeVal.plusHours(4));
		System.out.println(dateTimeVal.plusMinutes(40));
		System.out.println(dateTimeVal.plusSeconds(20));
		System.out.println(dateTimeVal.minusYears(1));
		System.out.println(dateTimeVal.minusWeeks(3));
		System.out.println(dateTimeVal.minusDays(2));
		System.out.println(dateTimeVal.minusHours(4));
		System.out.println(dateTimeVal.minusMinutes(40));
		System.out.println(dateTimeVal.minusSeconds(20));
		
		LocalDate dateLocal = dateTimeVal.toLocalDate();
		System.out.println("The given time value is: "+dateLocal);
		LocalTime timeLocal = dateTimeVal.toLocalTime();
		System.out.println("The given date value is: "+timeLocal);
		LocalDateTime dateTimeNow = LocalDateTime.now();
		System.out.println("The current date & time value is: "+dateTimeNow);

	}

}
