/**
 * 
 */
package com.eazybytes.util;

/**
 * @author EazyBytes
 *
 */
@FunctionalInterface
public interface ArithmeticOperation {

	public int performOperation(int a, int b);
	
	public default void performAdd(int a, int b) {
		System.out.println(a + b);
	}

	public static void printTheInput(int res) {
		System.out.println(res);
	}

}
