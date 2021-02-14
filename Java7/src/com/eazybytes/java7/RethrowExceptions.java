/**
 * 
 */
package com.eazybytes.java7;

/**
 * @author EazyBytes
 *
 */
@SuppressWarnings("serial")
public class RethrowExceptions {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		//beforeJava7("First");
		withJava7("First");
	}

	/**
	 * Sample implementation before Java 7
	 * 
	 * @throws Exception
	 *
	 */
	public static void beforeJava7(String exceptionName) throws Exception {
		try {
			if (exceptionName.equals("First")) {
				throw new FirstException();
			} else {
				throw new SecondException();
			}
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Sample implementation from Java 7
	 * 
	 * @throws FirstException,SecondException
	 * 
	 */
	public static void withJava7(String exceptionName) throws FirstException, SecondException {
		try {
			if (exceptionName.equals("First")) {
				throw new FirstException();
			} else {
				throw new SecondException();
			}
		} catch (Exception e) {
			throw e;
		}
	}

	static class FirstException extends Exception {
		
	}

	static class SecondException extends Exception {
		
	}

}
