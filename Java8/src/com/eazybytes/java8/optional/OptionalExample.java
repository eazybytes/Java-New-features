package com.eazybytes.java8.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample {

	public static void main(String args[]) {
		withJava8();
	}

	public static void beforeJava8() {
		String[] str = new String[10];
		String lowercaseString = str[5].toLowerCase();
		System.out.print(lowercaseString);
	}

	public static void withJava8() {
		String[] str = new String[10];
		str[5] = "Eazy Bytes";

		Optional<String> empty = Optional.empty();
		System.out.println(empty);

		Optional<String> value = Optional.of(str[5]);
		System.out.println(value.get());
		// We should of() when we are sure that value will present, otherwise go for
		// ofNullable()
		Optional<String> nullValue = Optional.ofNullable(str[4]);
		nullValue.ifPresent(System.out::println);
		System.out.println(nullValue.orElse("No Value"));

		Optional<String> nonEmptyString = Optional.of("Eazy Bytes");
		Optional<String> emptyString = Optional.empty();

		System.out.println("Non-Empty Optional: " + nonEmptyString.map(String::toUpperCase));
		System.out.println("Empty Optional: " + emptyString.map(String::toUpperCase));

		Optional<Optional<String>> nonEmptyOptionalInput = Optional.of(Optional.of("Eazy Bytes"));
		System.out.println("Optional value: " + nonEmptyOptionalInput);
		System.out.println("Optional.map: " + nonEmptyOptionalInput.map(input -> input.map(String::toUpperCase)));
		System.out
				.println("Optional.flatMap: " + nonEmptyOptionalInput.flatMap(input -> input.map(String::toUpperCase)));

		Optional<String> country = Optional.of("INDIA");
		Optional<String> emptyCountry = Optional.empty();

		// Filter on Optional
		System.out.println(country.filter(g -> g.equals("india"))); // Optional.empty
		System.out.println(country.filter(g -> g.equalsIgnoreCase("INDIA"))); // Optional[MALE]
		System.out.println(emptyCountry.filter(g -> g.equalsIgnoreCase("INDIA"))); // Optional.empty

		if (country.isPresent()) {
			System.out.println("Value available");
		}

		country.ifPresent(c -> System.out.println("In Country Option, value available is:" + c));

		// condition failed, no output will be printed
		emptyCountry.ifPresent(c -> System.out.println("In Country Option, value available is:" + c));

		System.out.println(country.orElse("No Country data available"));
		System.out.println(emptyCountry.orElse("No Country data available"));
		System.out.println(emptyCountry.orElseGet(()->"No Country data available"));
		System.out.println(emptyCountry.orElseThrow(NoSuchElementException::new));
		
		/*
		 * country.ifPresentOrElse(value -> System.out.println("Value is present, its: "
		 * + value), () -> { System.out.println("Value is empty"); });
		 */
	}
}
