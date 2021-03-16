/**
 * 
 */
package com.java9.miscellaneous;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

/**
 * @author Eazy Bytes
 *
 */
public class MiscellaneousEnhancements {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		tryWithResource();
		objectsMethods();
		diamondOperatorInAnanymousInnerClass();
	}

	public static void diamondOperatorInAnanymousInnerClass() {
		SampleInnerClass<String> innClass = new SampleInnerClass<>() {
			public String append(String a, String b) {
				return a + b;
			}
		};
		String result = innClass.append("Eazy", "Bytes");
		System.out.println(result);
	}

	private static void objectsMethods() {
		String msg = null;
		String nonNullElse = Objects.requireNonNullElse(msg, "None");
		System.out.println(nonNullElse);
		String nonNullElseGet = Objects.requireNonNullElseGet(msg, () -> "NA");
		System.out.println(nonNullElseGet);

		String input = "Eazy Bytes";
		int res = Objects.checkIndex(8, input.length());
		System.out.println(res);
		res = Objects.checkFromIndexSize(0, 7, input.length());
		System.out.println(res);
		res = Objects.checkFromToIndex(0, 7, input.length());
		System.out.println(res);
	}

	private static void tryWithResource() throws IOException {
		InputStream inputStream = Files.newInputStream(Paths.get("Hello.txt"));
		try (inputStream) {
			inputStream.readAllBytes();
		}
	}

}

abstract class SampleInnerClass<T> {
	public abstract T append(T a, T b);
}
