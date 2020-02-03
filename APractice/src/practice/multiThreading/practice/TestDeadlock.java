package practice.multiThreading.practice;

import java.util.Scanner;

public class TestDeadlock {

	public static void main(String[] args) {
		String str = "resource 1";
		String str2 = "resource 2";
		Thread t = new Thread() {
			public void run() {
				synchronized (str) {
					System.out.println("Grip on res 1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (str2) {
						System.out.println("Grip on res 2");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (str2) {
					System.out.println("Grip on resource 2");
//					try {
//					//	Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}

					synchronized (str) {
						System.out.println("Grip on resource 1");
					}
				}
			}
		};

		t.start();
		t2.start();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = 9;

		// Thread.sleep(100);
		double g = j / 0;
		try {
			throw new Exception();
		} catch (Throwable a) {

		}
	}

}
