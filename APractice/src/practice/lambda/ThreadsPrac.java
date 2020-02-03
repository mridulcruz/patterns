package practice.lambda;

public class ThreadsPrac extends Thread implements ThreadsPrac1, ThreadsPrac2 {
	public void run() {
		Thread th = this.currentThread();

		System.out.println("fvsd");
		System.out.println("sdffvsd");

	}

	public static void main(String sd[]) {

		// sds.run();

		for (int i = 0; i < 2; i++) {
			ThreadsPrac sds = new ThreadsPrac();
			sds.start();

			System.out.println(i);
		}
	}

	@Override
	public void sd() {
		// TODO Auto-generated method stub

	}

	@Override
	public int main1(String df) {
		// TODO Auto-generated method stub
		return ThreadsPrac1.super.main1(df);
	}

	int i = ThreadsPrac1.super.main1("fdvs");

}

interface ThreadsPrac1 {
	void sd();

	default int main1(String df) {
		System.out.println("Jeetuu");
		return 1;
	}

	static void main(String df[]) {
		System.out.println("Jeetu");
	}
}

interface ThreadsPrac2 {
	void sd();

	default int main1(String df) {
		System.out.println("dJeetuu");
		return 1;
	}

	static void main(String df) {
		System.out.println("Jeetu");
	}
}