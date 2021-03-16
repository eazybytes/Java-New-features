/**
 * 
 */
package com.java9.collections;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author EazyBytes
 *
 */
public class CollectionEnhancements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> oldStyleList = new ArrayList<>();
		oldStyleList.add("Old Style");
		oldStyleList =Collections.unmodifiableList(oldStyleList);

		List<String> emptyList = List.of();
		System.out.println(emptyList.toString());
		List<String> stringList = List.of("Eazy", "Bytes", "Java 9");
		System.out.println(stringList.toString());
		List<Integer> numList = List.of(1, 4, 5, 8);
		System.out.println(numList.toString());

		Set<String> oldStyleSet = new HashSet<>();
		oldStyleSet.add("Old Style");
		oldStyleSet =Collections.unmodifiableSet(oldStyleSet);

		Set<String> emptySet = Set.of();
		System.out.println(emptySet.toString());
		Set<String> stringSet = Set.of("Eazy", "Bytes", "Java 9");
		System.out.println(stringSet.toString());
		Set<Integer> numSet = Set.of(1, 4, 5, 8);
		System.out.println(numSet.toString());

		Map<String, String> oldStyleMap = new HashMap<>();
		oldStyleMap.put("Old", "Style");
		System.out.println(oldStyleMap.toString());
		oldStyleMap =Collections.unmodifiableMap(oldStyleMap);

		Map<String, String> emptyMap = Map.of();
		Map<String, String> emptyMapEntries = Map.ofEntries();
		System.out.println(emptyMap.toString());
		System.out.println(emptyMapEntries.toString());

		Map<String, String> inputMap = Map.of("Eazy", "Bytes", "Java9", "Great");
		System.out.println(inputMap.toString());

		Map<Integer, String> inputEntryMap = Map.ofEntries(new AbstractMap.SimpleEntry<>(1, "Hello"),
				new AbstractMap.SimpleEntry<>(2, "Eazy Bytes"));

		System.out.println(inputEntryMap.toString());
	}

}
