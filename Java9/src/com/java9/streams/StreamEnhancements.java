/**
 * 
 */
package com.java9.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Eazy Bytes
 *
 */
public class StreamEnhancements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Stream<String> emptyStream = Stream.ofNullable("");
		System.out.println(emptyStream.count());
		Stream<String> nullStream = Stream.ofNullable(null);
		System.out.println(nullStream.count());

		List<Integer> dropNums = Stream.of(1, 2, 3, 4, 5, 6).dropWhile(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println(dropNums.toString());

		List<String> dropString = Stream.of("Eazy", "Bytes", "Java").dropWhile(word -> word.startsWith("B"))
				.collect(Collectors.toList());
		System.out.println(dropString.toString());

		List<Integer> takeNums = Stream.of(1, 2, 3, 4, 5, 6).takeWhile(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println(takeNums.toString());

		List<String> takeString = Stream.of("Eazy", "Bytes", "Java").takeWhile(word -> word.startsWith("E"))
				.collect(Collectors.toList());
		System.out.println(takeString.toString());

		List<Integer> numStream = Stream.iterate(10, i -> i <= 100, i -> i + 2).collect(Collectors.toList());
		System.out.println(numStream.toString());

	}

}
