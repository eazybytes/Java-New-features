/**
 * 
 */
package com.eazybytes.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author EazyBytes
 *
 */
public class CompletableFutureExample {

	/**
	 * @param args
	 * @throws ExecutionException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		runAsync();
		supplyAsync();
		thenApply();
		thenAccept();
		System.out.println("Main thread");
	}

	private static void runAsync() throws InterruptedException, ExecutionException {
		CompletableFuture<Void> async = CompletableFuture.runAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Running in a separate thread than the main thread.");
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
		});
		System.out.println("runAsync Blocking 1");
		async.get();
		System.out.println("runAsync Blocking 2");
	}

	private static void supplyAsync() throws InterruptedException, ExecutionException {
		CompletableFuture<String> async = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			return "Eazy Bytes";
		});
		System.out.println("supplyAsync Blocking 1");
		String result = async.get();
		System.out.println(result);
		System.out.println("supplyAsync Blocking 2");
	}

	private static void thenApply() throws InterruptedException, ExecutionException {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			return "Eazy";
		});

		System.out.println("thenApply middle block");

		CompletableFuture<String> finalFuture = future.thenApply(name -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			return name + " Bytes";
		});

		System.out.println("thenApply before final block");
		System.out.println(finalFuture.get());
		System.out.println("thenApply Blocking");
	}

	private static void thenAccept() throws InterruptedException, ExecutionException {
		CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			return "Accept";
		}).thenAccept(result -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			System.out.println("Received the value " + result);
		});
		System.out.println("thenAccept non-blocking");
		future.get();
	}

}
