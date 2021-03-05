/**
 * 
 */
package com.eazybytes.java8.lambda;

import com.eazybytes.util.ArithmeticOperation;

/**
 * @author EazyBytes
 *
 */
public class AnanymousVsLambda {

	int sum = 0;
	
	public void sum() {
		int tempSum = 0;
		ArithmeticOperation sumOperation = (a,b)-> {
			int sum = 0;
			// tempSum = 0; //Compilation error
			this.sum = a+b;
			System.out.println("The value of sum inside lambda is: "+sum);
			return this.sum;
		};
		System.out.println("The sum of given 2 numbers is: "+sumOperation.
				performOperation(10, 20));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnanymousVsLambda lamda = new AnanymousVsLambda();
		lamda.sum();
	}

}
