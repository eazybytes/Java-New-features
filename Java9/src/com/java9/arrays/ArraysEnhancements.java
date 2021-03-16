/**
 * 
 */
package com.java9.arrays;

import java.util.Arrays;

/**
 * @author Eazy Bytes
 *
 */
public class ArraysEnhancements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		misMatch();
		compare();
		equals();

	}

	private static void misMatch() {

		int res = Arrays.mismatch(new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 2, 3, 4, 5 });
		System.out.println(res);
		res = Arrays.mismatch(new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 2, 3, 6, 5 });
		System.out.println(res);
	}

	private static void compare() {

		int res = Arrays.compare(new int[] { 1 }, new int[] { 1 });
		System.out.println(res);

		int resIndex = Arrays.compare(new String[] { "Eazy", "Bytes" }, new String[] { "Hello", "Eazy", "Bytes" });
		System.out.println(resIndex);
	}

	private static void equals() {

		boolean result = Arrays.equals(new String[] { "Eazy", "Bytes" }, new String[] { "Eazy", "Bytes" });
		System.out.println(result);

		result = Arrays.equals(new String[] { "Eazy", "Bytes" }, new String[] { "Eazy", "Bytes", "Java9" });
		System.out.println(result);

		result = Arrays.equals(new String[] { "Eazy", "Bytes" }, 0, 1, new String[] { "Eazy", "Bytes", "Java9" }, 0, 1);
		System.out.println(result);
	}
}
