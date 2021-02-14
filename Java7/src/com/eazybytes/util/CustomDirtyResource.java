/**
 * 
 */
package com.eazybytes.util;

/**
 * @author EazyBytes
 *
 */
public class CustomDirtyResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		throw new NullPointerException("OOOPs. It is very bad to have a NullPointerExceptions !!");

	}

	public void readFromResource() {
		throw new RuntimeException("I am sorry. I don't have data available right now due to network issue !!!");
	}

}
