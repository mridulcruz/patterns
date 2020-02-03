package practice.lambda;

public class LambdaAssert {
	public static void main(String fd[]) throws Exception {
		Win.ms(() -> Win.mss(3));
	}

	private static Integer mss(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}

class Win {

	private final Throwable caught;

	public Win(Throwable caught) {
		this.caught = caught;
	}

	public static void ms(MyInterface id) throws Exception {
		throw new Exception();
	}

	public static int mss(int id1) {
		return 2;
	}
}

@FunctionalInterface
interface MyInterface {
	public Integer myMeth();
}