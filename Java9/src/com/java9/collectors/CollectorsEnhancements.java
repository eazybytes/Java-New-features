/**
 * 
 */
package com.java9.collectors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Eazy Bytes
 *
 */
public class CollectorsEnhancements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> numStream = Stream.iterate(10, i -> i <= 100, i -> i + 2)
				.collect(Collectors.filtering(num -> num % 4 == 0, Collectors.toList()));
		System.out.println(numStream.toString());

		List<Integer> numStreamFlatMap = Stream.of(List.of(1, 2, 3, 4), List.of(5, 6, 7, 8))
				.collect(Collectors.flatMapping(input -> input.stream().filter(i -> i % 2 == 0), Collectors.toList()));
		System.out.println(numStreamFlatMap.toString());

	}

}
