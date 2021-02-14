/**
 * 
 */
package com.eazybytes.java7;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.eazybytes.util.CustomDirtyResource;

/**
 * @author EazyBytes
 *
 */
public class SupressedExceptions {

	private final static Logger LOGGER = Logger.getLogger(SupressedExceptions.class.getName());

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) {
		try {
			beforeJava7();
		} catch (Exception ex) {
			LOGGER.log(Level.SEVERE, ex.getMessage());
		}
		
		try {
			withJava7();
		} catch (Exception ex) {
			LOGGER.log(Level.SEVERE, ex.getMessage());
			final Throwable[] suppressedExceptions = ex.getSuppressed();
			final int numSuppressed = suppressedExceptions.length;
			if (numSuppressed > 0) {
				for (final Throwable exception : suppressedExceptions) {
					LOGGER.log(Level.SEVERE, exception.getMessage());
				}
			}
		}
	}

	/**
	 * Sample implementation before Java 7
	 * 
	 * @throws Exception
	 */
	public static void beforeJava7() throws Exception {
		CustomDirtyResource cr = null;
		try {
			cr = new CustomDirtyResource();
			cr.readFromResource();
		} finally {
			cr.close();
		}
	}

	/**
	 * Sample implementation from Java 7
	 * @throws Exception 
	 */
	public static void withJava7() throws Exception {
		try (CustomDirtyResource cr = new CustomDirtyResource();) {
			cr.readFromResource();
		}
	}

}
