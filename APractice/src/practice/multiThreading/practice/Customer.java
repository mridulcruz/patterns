package practice.multiThreading.practice;

class Test {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}

		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount, int with) {
		System.out.println("going to deposit...");

		this.amount += amount;
		if (this.amount >= with) {
			System.out.println("deposit completed... ");
			notify();
		} else {
			System.out.println("deposit amt less than expected... ");
		}

	}
}

public class Customer {
	public static void main(String args[]) {
		final Test c = new Test();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(1000, 15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(4000, 15000);
			}
		}.start();

	}
}

//going to deposit...
//going to deposit...
//deposit completed... 
//going to withdraw...
//withdraw completed...
//deposit amt less than expected... 
//Exception in thread "Thread-2" java.lang.IllegalMonitorStateException
//	at java.lang.Object.notify(Native Method)
//	at practice.multiThreading.practice.Test.deposit(Customer.java:27)
//	at practice.multiThreading.practice.Customer$3.run(Customer.java:50)
