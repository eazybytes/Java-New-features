/**
 * 
 */
package com.java9.miscellaneous;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author EazyBytes
 *
 */
public class TryWithResources {
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		beforeJava7();
		withJava7();
		withJava9();
	}

	/**
	 * Sample implementation before Java 7 
	 * @throws IOException 
	 */
	public static void beforeJava7() throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:/eazybytes.txt"));
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} finally {
			br.close();
		}
	}
	
	/**
	 * Sample implementation from Java 7 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void withJava7() throws FileNotFoundException, IOException {
		try(BufferedReader br = new BufferedReader(new FileReader("C:/eazybytes.txt"));) {
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		}
	}
	
	/**
	 * Sample implementation from Java 9 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void withJava9() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:/eazybytes.txt"));
		try(br) {
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		}
	}

}
