/**
 * 
 */
package com.eazybytes.java7;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * @author EazyBytes
 *
 */
public class FilesInJava7 {

	private static String HOME_DIR = "C:\\";

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		workingWithFiles();

	}

	private static void workingWithFiles() throws IOException {
		
		Path path = Paths.get(HOME_DIR, "java7", "Test.txt");
		byte[] bytes = Files.readAllBytes(path);
		String content = new String(bytes, StandardCharsets.UTF_8);
		System.out.println("Content of the file is: " + content);
		
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		for(String line : lines) {
			System.out.println("Content of the line is: " + line);
		}
		
		String newLine = " How are you?";
		Files.write(path,newLine.getBytes() , StandardOpenOption.APPEND);
		
		Path newPath = Paths.get(HOME_DIR, "java8");
		Files.createDirectory(newPath);
		Path filePath = Paths.get(HOME_DIR, "java8","Hello.txt");
		Files.createFile(filePath);
		
		Path newFilePath = Paths.get(HOME_DIR, "java8","Test.txt");
		InputStream in = Files.newInputStream(path);
		Files.copy(in, newFilePath);
		
		Files.copy(path, filePath, StandardCopyOption.REPLACE_EXISTING,
				StandardCopyOption.COPY_ATTRIBUTES);
		
		Files.delete(newFilePath);
		boolean deleted = Files.deleteIfExists(newFilePath);
		System.out.println(deleted);
		
	}
}
