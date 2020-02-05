package designPattern;

abstract class SubjectForProxy {
	abstract void doSomething();
}

class ConcreteClass extends SubjectForProxy {
	void doSomething() {
		System.out.println("Inside concrete class");
	}
}

class ProxyClass extends SubjectForProxy {

	ConcreteClass con;

	void doSomething() {
		if (con == null)
			con = new ConcreteClass();
		con.doSomething();
	}
}

public class ProxyPatternEx {

	public static void main(String[] args) {
		ProxyClass pc = new ProxyClass();
		pc.doSomething();
	}

}
