package practice.multiThreading.ticketBooking;

public class Ticket {
	static Long noOfTicketsAvailable = 29l;

	public void bookTicket(int noOfTktsAsked, String name) {
		// public void bookTicket(int noOfTktsAsked, String name) {
		if (noOfTicketsAvailable > -20 /* && noOfTicketsAvailable >= noOfTktsAsked */) {
			System.out.println("Tickets " + noOfTktsAsked + "Booked Successfully For MR." + name);
			noOfTicketsAvailable -= noOfTktsAsked;
			System.out.println(noOfTicketsAvailable + " v ");
		} else {
			System.out.println("Sorry MR." + name + " Only " + noOfTicketsAvailable + " Tickets Available");
		}
	}
}

//public class Ticket {
//// volatile Integer noOfTicketsAvailable = 3;
//AtomicInteger noOfTicketsAvailable = new AtomicInteger(3);
//
//// public synchronized void bookTicket(int noOfTktsAsked, String name) {
//public void bookTicket(int noOfTktsAsked, String name) {
//	if (noOfTicketsAvailable.get() > 0 && noOfTicketsAvailable.get() >= noOfTktsAsked) {
//		System.out.println("Tickets " + noOfTktsAsked + "Booked Successfully For MR." + name);
//		// noOfTicketsAvailable -= noOfTktsAsked;
//		noOfTicketsAvailable.set(noOfTicketsAvailable.get() - noOfTktsAsked);
//	} else {
//		System.out.println("Sorry MR." + name + " Only " + noOfTicketsAvailable + " Tickets Available");
//	}
//}
//}