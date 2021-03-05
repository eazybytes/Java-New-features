/**
 * 
 */
package com.eazybytes.java8.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author EazyBytes
 *
 */
public class MapEnhancementsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		mapEnhancements();
	}

	private static void mapEnhancements() {
		Map<String, String> map = new HashMap<>();
		map.put("India", "Delhi");
		map.put("USA", "Washington");
		map.put("Japan", "Tokyo");
		map.put("China", "Beijing");
		map.put("Germany", "Berlin");
		map.put("England", "London");

		map.forEach((country, capital) -> System.out.println("The capital of " + country + " is: " + capital));

		map.entrySet().stream().sorted(Entry.comparingByKey()).forEachOrdered(System.out::println);
		map.entrySet().stream().sorted(Entry.comparingByValue()).forEachOrdered(System.out::println);
		System.out.println(map.getOrDefault("Russia", "No Data present"));
		map.computeIfAbsent("Spain", name -> "Madrid");
		map.computeIfPresent("USA", (k, v) -> "Washington DC");
		map.compute("India", (key, val) -> "New " + val);
		map.remove("England", "London");
		map.replaceAll((country, capital) -> capital.toUpperCase());
		map.replace("India", "Delhi");
		map.entrySet().stream().sorted(Entry.comparingByValue()).forEachOrdered(System.out::println);
	}
}
