/**
 * 
 */
package com.eazybytes.java7;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author EazyBytes
 *
 */
public class PathsInJava7 {

	private static String HOME_DIR = "C:\\";
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		buildPath();
	}
	
	private static void buildPath() throws IOException {
		Path path = Paths.get(HOME_DIR, "java7", "Test.txt");
		Path fileName = path.getFileName();
		System.out.println("File name is : "+fileName.toString());
		System.out.println("Fiel system is : "+path.getFileSystem().toString());
		System.out.println("Fiel system separator is : "+path.getFileSystem().getSeparator());
		for(int i=0;i<path.getNameCount();i++) {
			Path subPath = path.getName(i);
			System.out.println("Path location at index : "+(i+1)+" is "+subPath.toString());
		}
		System.out.println("Sub path is "+path.subpath(0,2));
		System.out.println("Root path is "+path.getRoot());
		System.out.println("Parent path is "+path.getParent());
		
		Path redundantPath = Paths.get(HOME_DIR, "java7", ".","Test.txt");
		System.out.println("Redundant path is "+redundantPath.toString());
		Path cleanPath = redundantPath.normalize();
		System.out.println("Clean path is "+cleanPath.toString());
		URI uri = cleanPath.toUri();
		System.out.println("URI path is "+uri.toString());
		System.out.println("Absolute path is "+cleanPath.toAbsolutePath().toString());

		
		Path partialPath = Paths.get(HOME_DIR, "java7");
	    Path combinedPath = partialPath.resolve("Test.txt");
	    System.out.println("Combined path is "+combinedPath.toString());
	    
	    if(!partialPath.equals(combinedPath)) {
	    	System.out.println("Paths are not equal");
	    }
	}

}
