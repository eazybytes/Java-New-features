/**
 * 
 */
package com.eazybytes.java7;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 * @author EazyBytes
 *
 */
public class WatchServiceInJava7 {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		directoryWatchService();
	}

	/**
	 * Sample implementation from Java 7
	 * 
	 * @throws Exception
	 *
	 */
	public static void directoryWatchService() throws Exception {
		WatchService watchService = FileSystems.getDefault().newWatchService();
		Path path = Paths.get("C:\\WatchService");
		path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY,
				StandardWatchEventKinds.ENTRY_DELETE);
		boolean poll = true;
		WatchKey key = watchService.take();
		while (poll) {
			for (WatchEvent<?> event : key.pollEvents()) {
				System.out.println("Event kind : " + event.kind() + " - for the file : " + event.context());
			}
			poll = key.reset();
		}
		
	}

}
