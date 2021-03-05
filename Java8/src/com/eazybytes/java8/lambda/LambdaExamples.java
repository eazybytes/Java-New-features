package com.eazybytes.java8.lambda;

public class LambdaExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		voidMethodWithNoParams();
		voidMethodWithOneParam();
		voidMethodWithTwoParams();
		returnMethodWithTwoParams();
	}

	private static void voidMethodWithNoParams() {

		VoidMethodWithNoParams method = () -> {
			System.out.println("Method with no return and input params");
		};

		VoidMethodWithNoParams method1 = () -> System.out.println("Ignoring {} since we have only 1 line");

		method.printHello();
		method1.printHello();
	}

	private static void voidMethodWithOneParam() {
		VoidMethodWithOneParam method = (input) -> {
			System.out.println(input);
		};

		VoidMethodWithOneParam method1 = (input) -> System.out.println(input.toLowerCase());

		VoidMethodWithOneParam method2 = input -> System.out.println(input.toUpperCase());

		method.printInput("Hello");
		method1.printInput("Eazy Bytes");
		method2.printInput("Welcome");

	}

	private static void voidMethodWithTwoParams() {
		VoidMethodWithTwoParams addition = (a, b) -> {
			System.out.println(a + b);
		};

		VoidMethodWithTwoParams multiplication = (a, b) -> System.out.println(a * b);

		addition.calculateAndPrint(5, 2);
		multiplication.calculateAndPrint(5, 2);

	}

	private static void returnMethodWithTwoParams() {
		ReturnMethodWithTwoParams addition = (a, b) -> {
			return (a + b);
		};

		System.out.println(addition.calculateAndReturn(5, 2));

		ReturnMethodWithTwoParams multiply = (a, b) -> {
			return (a * b);
		};

		System.out.println(multiply.calculateAndReturn(5, 2));

		ReturnMethodWithTwoParams division = (a, b) -> a / b;

		System.out.println(division.calculateAndReturn(100, 5));

	}

}
