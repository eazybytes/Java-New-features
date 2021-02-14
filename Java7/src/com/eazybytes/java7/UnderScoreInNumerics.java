/**
 * 
 */
package com.eazybytes.java7;

/**
 * @author EazyBytes
 *
 */
public class UnderScoreInNumerics {

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
		int inum = 10000456;
		System.out.println("Integer value is :" + inum);
		long lnum = 10000456;
		System.out.println("Long value is :" + lnum);
		float fnum = 3.141325F;
		System.out.println("Float value is :" + fnum);
		double dnum = 64565.5793123;
		System.out.println("Double value is :" + dnum);
		long longBinary = 0b0000011101100011;
		System.out.println("Decimal value of Binary representation is :" + longBinary);
	}

	/**
	 * Sample implementation from Java 7
	 * 
	 */
	public static void withJava7() {
		int inum = 10_000_456;
		System.out.println("Integer value using underscore is :" + inum);
		long lnum = 10_000_456;
		System.out.println("Long value using underscore is :" + lnum);
		float fnum = 3.14_13_25F;
		System.out.println("Float value using underscore is :" + fnum);
		double dnum = 64_565.579_31_23;
		System.out.println("Double value using underscore is :" + dnum);
		long longBinary = 0b0_000_011_101_100_011;
		System.out.println("Decimal value of Binary representation using underscore is :" + longBinary);
		
		/*
		 * String input = "10_000_456"; System.out.println(Integer.parseInt(input));
		 */
		 
	}

}
