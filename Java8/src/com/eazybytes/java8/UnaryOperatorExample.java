/**
 * 
 */
package com.eazybytes.java8;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @author EazyBytes
 *
 */
public class UnaryOperatorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating a Function
		Function<String, String> convertStr = input -> input.toUpperCase();

		// Calling Function method
		System.out.println("The uppercase value of given input is : " + convertStr.apply("Eazy Bytes"));

		// Creating a Function
		UnaryOperator<String> convertStrWithUnary = input -> input.toUpperCase();

		// Calling Function method
		System.out.println("The uppercase value of given input with Unary operator is : "
				+ convertStrWithUnary.apply("Eazy Bytes"));

		UnaryOperator<String> sameValue = UnaryOperator.identity();

		// Calling Function method
		System.out.println("The value of given input is : " + sameValue.apply("Eazy Bytes"));

		Function<Integer, Integer> multiplyOperation = a -> {
			System.out.println("Multiply by 2 Operation");
			return a * 2;
		};

		UnaryOperator<Integer> tripleOperation = a -> {
			System.out.println("Multiply by 3 Operation");
			return a * 3;
		};

		// Chaining the function methods using andThen()
		multiplyOperation = multiplyOperation.andThen(tripleOperation);

		System.out.println(multiplyOperation.apply(5));

		// Chaining the function methods using andThen()
		multiplyOperation = multiplyOperation.compose(tripleOperation);

		System.out.println(multiplyOperation.apply(5));

	}

}
