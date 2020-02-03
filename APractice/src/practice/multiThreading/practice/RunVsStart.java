package practice.multiThreading.practice;

public class RunVsStart extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(500);
				System.out.println(
						Thread.currentThread().getName() + " " + i + " " + Thread.currentThread().getPriority());
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Thread rs = new RunVsStart();
		Thread rs1 = new RunVsStart();
		Thread rs2 = new RunVsStart();
		rs.start();
		try {
			rs.join(500);
			// throw new InterruptedException();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Oye");
		}

		rs1.start();
		rs2.start();
		rs.run();

	}

}
