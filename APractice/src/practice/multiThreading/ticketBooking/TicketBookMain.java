package practice.multiThreading.ticketBooking;

public class TicketBookMain {

	public static void main(String[] args) {
		Ticket t = new Ticket();
		Thread t1 = new Thread(new TicketBooking(t, "Ankit", 15));
		Thread t2 = new Thread(new TicketBooking(t, "Kavita", 40));
		t1.start();
		t2.start();

	}

}
