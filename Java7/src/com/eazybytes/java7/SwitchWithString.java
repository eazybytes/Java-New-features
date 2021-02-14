/**
 * 
 */
package com.eazybytes.java7;

/**
 * @author EazyBytes
 *
 */
public class SwitchWithString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		displayTodayDetails();
		displayWeekDetails();
	}

	private static void displayTodayDetails() {
		String input = "Wednesday";
		switch (input) {
		case "Monday":
			System.out.println("Today is Monday");
			break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;
		case "Thursday":
			System.out.println("Today is Thursday");
			break;
		case "Friday":
			System.out.println("Today is Friday");
			break;
		case "Saturday":
			System.out.println("Today is Saturday");
			break;
		default:
			System.out.println("Today is Sunday");
		}
	}
	
	private static void displayWeekDetails() {
		String input = "Saturday";
		switch (input) {
		case "Monday": case "Tuesday": case "Wednesday": case "Thursday": case "Friday":
			System.out.println("Today is Weekday");
			break;
		case "Saturday": case "Sunday":
			System.out.println("Today is Weekend");
			break;
		default:
			System.out.println("Today is Holiday");
		}
	}

}
