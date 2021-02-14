/**
 * 
 */
package com.eazybytes.java7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author EazyBytes
 *
 */
public class CatchingMultipleExceptions {

	private final static Logger LOGGER = Logger.getLogger(CatchingMultipleExceptions.class.getName());

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		beforeJava7();
		withJava7();
	}

	/**
	 * Sample implementation before Java 7
	 *
	 */
	public static void beforeJava7() {
		int arr[] = { 1, 2, 3 };
		try {
			for (int i = 0; i < arr.length + 1; i++) {
				System.out.println(arr[i]);
			}
		} catch (NullPointerException nex) {
			LOGGER.log(Level.SEVERE, nex.toString());
		} catch (ArrayIndexOutOfBoundsException aioex) {
			LOGGER.log(Level.SEVERE, aioex.toString());
		}
	}

	/**
	 * Sample implementation from Java 7
	 * 
	 */
	public static void withJava7() {
		int arr[] = { 1, 2, 3 };
		try {
			for (int i = 0; i < arr.length + 1; i++) {
				System.out.println(arr[i]);
			}
		} catch (NullPointerException | ArrayIndexOutOfBoundsException | ClassCastException ex) {
			LOGGER.log(Level.SEVERE, ex.toString());
		}
	}

}
