package designPattern;

import java.util.Objects;

class SingletonEagerInitialization {
	public static SingletonEagerInitialization sei;

	private SingletonEagerInitialization() {
		System.out.println("SingletonEagerInitialization is created");
	}

	static {
		sei = new SingletonEagerInitialization();
	}

	public void display() {
		System.out.println("Displayed by eager");
	}
}

class SingletonLazyInitialization {
	private static SingletonLazyInitialization sei;

	private SingletonLazyInitialization() {
		System.out.println("SingletonLazyInitialization is created");
	}

	public static SingletonLazyInitialization getLazyObj(int i) {
		if (Objects.isNull(sei)) {
			sei = new SingletonLazyInitialization();
			System.out.println("New Object created by thread " + i);
		} else {
			System.out.println("No new Object created " + i);
		}
		return sei;
	}

	public void display() {
		System.out.println("Displayed by eager");
	}
}

class SingletonLazyInitializationThreadSafe {
	private static SingletonLazyInitializationThreadSafe sei;

	private SingletonLazyInitializationThreadSafe() {
		System.out.println("SingletonLazyInitializationThreadSafe is created");
	}

	public static SingletonLazyInitializationThreadSafe getLazyObj(int i) {
		if (Objects.isNull(sei)) {
			synchronized (SingletonLazyInitializationThreadSafe.class) {
				sei = new SingletonLazyInitializationThreadSafe();
			}
			System.out.println("New Object created by thread " + i);
		} else {
			System.out.println("No new Object created " + i);
		}
		return sei;
	}

	public void display() {
		System.out.println("Displayed by eager");
	}
}

public class SingletonPatternEx {

	public static void main(String[] args) {
		// SingletonEagerInitialization eagerObj = SingletonEagerInitialization.sei;
		// eagerObj.display();
//		Thread t1 = new Thread(new Runnable() {
//			public void run() {
//				SingletonLazyInitialization lazyObj = SingletonLazyInitialization.getLazyObj(1);
//				// System.out.println("Run by t1");
//			}
//		});
//
//		Thread t2 = new Thread(() -> {
//			SingletonLazyInitialization lazyObj = SingletonLazyInitialization.getLazyObj(2);
//			// System.out.println("Run by t2");
//		});
//		Thread t3 = new Thread(() -> {
//			SingletonLazyInitialization lazyObj = SingletonLazyInitialization.getLazyObj(3);
//			// System.out.println("Run by t3");
//		});

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				SingletonLazyInitializationThreadSafe lazyObj = SingletonLazyInitializationThreadSafe.getLazyObj(1);
				// System.out.println("Run by t1");
			}
		});

		Thread t2 = new Thread(() -> {
			SingletonLazyInitializationThreadSafe lazyObj = SingletonLazyInitializationThreadSafe.getLazyObj(2);
			// System.out.println("Run by t2");
		});
		Thread t3 = new Thread(() -> {
			SingletonLazyInitializationThreadSafe lazyObj = SingletonLazyInitializationThreadSafe.getLazyObj(3);
			// System.out.println("Run by t3");
		});

		t1.start();
		t2.start();
		t3.start();
		SingletonLazyInitializationThreadSafe lazyObj = SingletonLazyInitializationThreadSafe.getLazyObj(8);
		SingletonLazyInitializationThreadSafe lazyObj1 = SingletonLazyInitializationThreadSafe.getLazyObj(9);
		SingletonLazyInitializationThreadSafe lazyObj2 = SingletonLazyInitializationThreadSafe.getLazyObj(10);
	}

}
