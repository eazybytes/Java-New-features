/**
 * 
 */
package com.eazybytes.java8;

import java.util.function.Consumer;

/**
 * @author EazyBytes
 *
 */
public class ConsumerExample {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating a Consumer
		Consumer<String> convertAndDisplay = input -> System.out.println("Converted value is: "+input.toUpperCase());

		// invoking accept method inside the Consumer
		convertAndDisplay.accept("Eazy Bytes");

		
		// Creating a Consumer
		Consumer<String> appendInput = input -> System.out.println("New value after appending is: "+"HELLO "+input);
		
		// invoking accept method inside the Consumer
		appendInput.andThen(convertAndDisplay).accept("Java 8");


	}

}
