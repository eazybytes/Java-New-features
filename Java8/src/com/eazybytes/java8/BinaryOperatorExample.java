/**
 * 
 */
package com.eazybytes.java8;

import java.util.function.BinaryOperator;

/**
 * @author EazyBytes
 *
 */
public class BinaryOperatorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating a BinaryOperator
		BinaryOperator<String> appendAndConvert = (word1, word2) -> (word1 + word2).toUpperCase();

		// Calling BinaryOperator method
		System.out.println("The updated value after appending and converting is : "
				+ appendAndConvert.apply("Hello ", "Eazy Bytes Students"));

		BinaryOperator<Integer> maxOperation = BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));
		System.out.println("The largest number is: "+maxOperation.apply(16, 30));
		
		BinaryOperator<Integer> minOperation = BinaryOperator.minBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));
		System.out.println("The smallest number is: "+minOperation.apply(16, 30));

	}

}
