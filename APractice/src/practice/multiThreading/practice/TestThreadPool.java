package practice.multiThreading.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			WorkerThread wt = new WorkerThread(i + "");
			ex.execute(wt);
		}
	}

}

class WorkerThread implements Runnable {
	String message;

	WorkerThread(String message) {
		this.message = message;
	}

	public void run() {
		System.out.println("We are at (START)" + Thread.currentThread().getName() + " Message: " + message);
		processRequest();
		System.out.println("We are at (END)" + Thread.currentThread().getName() + " Message: " + message);
	}

	public void processRequest() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
