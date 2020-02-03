package designPattern;

import java.util.ArrayList;
import java.util.List;

interface IObserver {
	void register(Observer o);

	void unsubscribe(Observer o);
}

class Observer {

	public void update(int i) {
		System.out.println("Observer is notified for " + i);
	}
}

class Subject implements IObserver {
	List<Observer> lst = new ArrayList<>();

	static int i;

	void setFlag(int b) {
		i = b;
		update();
	}

	public void register(Observer o) {
		lst.add(o);
	}

	public void unsubscribe(Observer o) {
		lst.remove(o);
	}

	private void update() {
		lst.forEach(obj -> {
			obj.update(i);
		});
	}
}

public class ObserverPatternEx {

	public static void main(String[] args) {
		Observer ob = new Observer();
		Observer ob1 = new Observer();
		Observer ob2 = new Observer();
		Subject sub = new Subject();
		sub.register(ob);
		sub.register(ob1);
		sub.register(ob2);
		sub.setFlag(5);
		sub.setFlag(225);
		sub.unsubscribe(ob);
		sub.unsubscribe(ob2);
		sub.setFlag(25);
		sub.setFlag(225);
	}

}
