package questions;

public class Jeethu {
	public static void main(String[] args) {
		String df = new String("aas");
		String sd = "aas";
//		String ad = "aas";
//		String da = new String("aas");
//		if (da == sd) {
//			System.out.println("thu");
//		} else {
//			System.out.println("ooye");
//		}
		Object cv = new Object();

		// if call by s = cv.deepCody();
		System.out.println(cv);
		// sd(cv);
		dfa a = new dfa();
		a.name = "jeethu";

		sd(cv, a);
		System.out.println(a.name);
		System.out.println(cv.hashCode());
		String s = "ds";
		System.out.println(s.hashCode());
		s = new String("ds");
		System.out.println(s.hashCode());
		s = s.concat("sd");
		System.out.println(s);
		StringBuilder sb = new StringBuilder(s);
		sb.append("jeetu");
		System.out.println(sb);
		System.out.println(sb.reverse());
	}

	public static void sd(Object s, dfa d) {
		System.out.println(s);
		d.name = "ayush";

	}
}

class dfa {
	String name;
}
