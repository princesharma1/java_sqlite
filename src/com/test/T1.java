package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
	private String message;

	public WorkerThread(String s) {
		this.message = s;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start >> message: " + message);
		processMsg();
		System.out.println(Thread.currentThread().getName() + " End");
	}

	private void processMsg() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

public class T1 {
	public static void main(String[] args) {

		ExecutorService excutorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread(" <-> " + i);
			excutorService.execute(worker);
		}
		excutorService.shutdown();
		//while (!excutorService.isTerminated()) {
			System.out.println("Finished All Threads");
		//}

	}
}