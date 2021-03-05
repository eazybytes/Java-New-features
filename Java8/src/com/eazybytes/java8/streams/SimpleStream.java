/**
 * 
 */
package com.eazybytes.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author EazyBytes
 *
 */
public class SimpleStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> departmentList = new ArrayList<>();
		departmentList.add("Supply");
		departmentList.add("HR");
		departmentList.add("Sales");
		departmentList.add("Marketing");

		Stream<String> depStream = departmentList.stream();
		depStream.forEach(System.out::println);

		Stream<String> inStream = Stream.of("Eazy", "Bytes", "Java");
		inStream.forEach(System.out::println);

		Stream<String> parallelStream = departmentList.parallelStream();
		parallelStream.forEach(System.out::println);

		Stream<String> emptyStream = Stream.empty();
		emptyStream.forEach(System.out::println);

		//Stream.generate(new Random()::nextInt).forEach(System.out::println);
		Stream.iterate(1, n->n+1).forEach(System.out::println);
	}

}
