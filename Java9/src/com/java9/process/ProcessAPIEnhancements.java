/**
 * 
 */
package com.java9.process;

import java.io.IOException;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

/**
 * @author EazyBytes
 *
 */
public class ProcessAPIEnhancements {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {

		ProcessHandle currProcess = ProcessHandle.current();
		long pid = currProcess.pid();
		System.out.println("The PID of current process of JVM is :" + pid);

		ProcessHandle.Info info = currProcess.info();
		System.out.println("The user of current process of JVM is :" + info.user());
		System.out.println("The command of current process of JVM is :" + info.command());
		System.out.println("The start time of current process of JVM is :" + info.startInstant());
		System.out.println("The total CPU time of current process of JVM is :" + info.totalCpuDuration());

		Optional<ProcessHandle> givenProcess = ProcessHandle.of(21388);
		ProcessHandle p = givenProcess.get();
		info = p.info();
		System.out.println("The user of given process of JVM is :" + info.user());
		System.out.println("The command of given process of JVM is :" + info.command());
		System.out.println("The start time of given process of JVM is :" + info.startInstant());
		System.out.println("The total CPU time of given process of JVM is :" + info.totalCpuDuration());

		Stream<ProcessHandle> allProcess = ProcessHandle.allProcesses();
		allProcess.limit(100).forEach(ph->System.out.println(ph.pid()));
		
		ProcessBuilder javapb=new ProcessBuilder("java","FrameDemo");
		Process javap=javapb.start();
		System.out.println("Process Started with id:"+javap.pid());
		CompletableFuture<Process> future=javap.onExit();
		future.thenAccept(p1->System.out.println("Process Terminated with Id:"+p1.pid()));
		System.out.println(future.get());
	}

}
