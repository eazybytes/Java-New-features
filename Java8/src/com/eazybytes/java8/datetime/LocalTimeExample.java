/**
 * 
 */
package com.eazybytes.java8.datetime;

import java.time.LocalTime;

/**
 * @author EazyBytes
 *
 */
public class LocalTimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalTime time = LocalTime.of(12, 30, 10);

		int hour = time.getHour();
		System.out.println("Given Houre is: " + hour);
		int minute = time.getMinute();
		System.out.println("Given minute is: " + minute);
		int second = time.getSecond();
		System.out.println("Given second is: " + second);
		
		LocalTime parseTime = LocalTime.parse("12:30:10");
		System.out.println("Given parse time is: " + parseTime);
		LocalTime currentTime = LocalTime.now();
		System.out.println("Given current time is: " + currentTime);
	}

}
