/**
 * 
 */
package com.eazybytes.java8.lambda;

import com.eazybytes.util.ArithmeticOperation;

/**
 * @author EazyBytes
 *
 */
public class ArithmeticImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int firstInt = 10, secondInt = 6;

		ArithmeticOperation oldsum = new ArithmeticOperation() {
			@Override
			public int performOperation(int a, int b) {
				return a + b;
			}
		};
		System.out.println(
				"The sum of two input integers with out lambda is : " + oldsum.performOperation(firstInt, secondInt));

		ArithmeticOperation sum = (a, b) -> a + b;
		ArithmeticOperation multi = (a, b) -> a * b;
		ArithmeticOperation sub = (a, b) -> a - b;
		
		System.out.println("The sum of two input integers is : " + sum.performOperation(firstInt, secondInt));
		System.out.println(
				"The multiplication of two input integers is : " + multi.performOperation(firstInt, secondInt));
		System.out.println("The subtraction of two input integers is : " + sub.performOperation(firstInt, secondInt));

	}

}
