package com.eazybytes.java7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafeVarExample {

	public static void main(String[] args) {
		sum(1);
		sum(1, 2);
		sum(1, 2, 3);

		SafeVarExample obj = new SafeVarExample();
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<String> list3 = new ArrayList<>();
		list1.add("Eazy");
		list2.add("Bytes");
		list3.add("Java 7");
		obj.print(list1, list2, list3);

		/*
		 * List<Integer> nums = new ArrayList<>(); nums.add(2); nums.add(3);
		 * obj.print(messages, nums);
		 */
	}

	@SafeVarargs
	public final void print(List<String>... messages) {
		String firstElement = messages[0].get(0); 
        System.out.println(firstElement); 
	}

	private static void sum(int... nums) {
		System.out.println(Arrays.toString(nums));
		int sum = 0;
		for (int num : nums) {
			sum = sum + num;
		}
		System.out.println("The total sum for the given input is : " + sum);
	}
}
