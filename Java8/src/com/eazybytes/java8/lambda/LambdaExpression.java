/**
 * 
 */
package com.eazybytes.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author EazyBytes
 *
 */
public class LambdaExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		beforeJava8();
		withJava8();

	}

	/**
	 * Before Java 8 Implementation
	 */
	private static void beforeJava8() {
		ArrayList<String> words = new ArrayList<>();
		words.add("Java 8");
		words.add("Lambda Expression");
		words.add("Awesome");
		words.add("Hi");

		Collections.sort(words, new Comparator<String>() {
			
			@Override
			public int compare(String first, String second) {
				return Integer.compare(first.length(), second.length());
			}
		});

		for (String word : words) {
			System.out.println(word);
		}

	}
	
	/**
	 * With Java 8 Implementation
	 */
	private static void withJava8() {
		ArrayList<String> words = new ArrayList<>();
		words.add("Java 8");
		words.add("Lambda Expression");
		words.add("Awesome");
		words.add("Hi");

		Collections.sort(words, (first,second)-> Integer.compare(first.length(), second.length()));
		
		for (String word : words) {
			System.out.println(word);
		}

	}

}
