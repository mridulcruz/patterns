package practice.multiThreading.ticketBooking;

public class TicketBooking implements Runnable {

	Ticket t;
	String name;
	Integer noOfTktsAsked;

	public TicketBooking(Ticket t1, String name, Integer noOfTktsAsked) {
		t = t1;
		this.name = name;
		this.noOfTktsAsked = noOfTktsAsked;
	}

	@Override
	public void run() {
		t.bookTicket(noOfTktsAsked, name);
	}

}
