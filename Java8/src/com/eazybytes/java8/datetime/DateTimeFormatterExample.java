package com.eazybytes.java8.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author EazyBytes
 *
 */
public class DateTimeFormatterExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2008, 6, 16);
		String baseISO = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(baseISO); // 20080616
		String localISO = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(localISO); // 2008-06-16

		LocalDate baseISODate = LocalDate.parse("20080616", DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(baseISODate);
		LocalDate localISODate = LocalDate.parse("2008-06-16", DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(localISODate);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		LocalDate localDate = LocalDate.of(2008, 6, 18);
		String formattedDate = localDate.format(formatter);
		System.out.println(formattedDate);

		DateTimeFormatter germanFormatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.GERMAN);
		LocalDate date1 = LocalDate.of(2008, 6, 16);
		String formattedDateGer = date1.format(germanFormatter); // 16. Juni 2008
		System.out.println(formattedDateGer);

	}
}
