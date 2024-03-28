package exercise_Ticket_reservation_System_enum;

public class Passenger {
	private String passengerName;
	private Seat seatClass;
	private double ticketPrice;
	
	Passenger(){}
	
	
	public Passenger(String passengerName, Seat seatClass) {
		this.passengerName = passengerName;
		this.seatClass = seatClass;
		this.ticketPrice = seatClass.getPrice();
	}



	public String getPassengerName() {
		return passengerName;
	}



	public Seat getSeatClass() {
		return seatClass;
	}



	public double getTicketPrice() {
		return ticketPrice;
	}



	@Override
	public String toString() {
		return "\n*Passenger name: " + passengerName + "\n*Seat Class: " + seatClass.getName() + "\n*Ticket Price: €" + ticketPrice;
	}
	
	
}
