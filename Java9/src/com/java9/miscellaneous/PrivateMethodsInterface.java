/**
 * 
 */
package com.java9.miscellaneous;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * @author EazyBytes
 *
 */
public interface PrivateMethodsInterface {

	default int addEvenNumbers(int... nums) {
		return add(num -> num % 2 == 0, nums);
	}

	default int addOddNumbers(int... nums) {
		return add(num -> num % 2 != 0, nums);
	}

	private int add(IntPredicate predicate, int... nums) {
		return IntStream.of(nums).filter(predicate).sum();
	}
}
