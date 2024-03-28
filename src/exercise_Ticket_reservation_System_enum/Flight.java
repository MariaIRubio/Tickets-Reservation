package exercise_Ticket_reservation_System_enum;

import java.util.ArrayList;
import java.util.List;

public class Flight {

	private List<Passenger> passengersList = new ArrayList<>();

	public void reserveSeat(Passenger passenger) {
		System.out.println("\n-Reserve a Seat.");
		if (!passengersList.contains(passenger)) {
			passengersList.add(passenger);
			System.out.println("Seated Reserved for " + passenger.getPassengerName() + " succesfully.");
		} else {
			System.out.println(passenger.getPassengerName() + " alreaday has a seat reservation.\nIt is not possible to reserve more than one seat for the same passenger.");
		}
	}
	
	public void cancelReservation(Passenger passenger) {
		System.out.println("\n-Cancel Reservation.");
		if(passengersList.contains(passenger)) {
		passengersList.remove(passenger);
		System.out.println("Reservation for passenger " + passenger.getPassengerName() + " canceled succesfully.");
		}else {
			System.out.println("The reservation for passenger " + passenger.getPassengerName() + " was not found.");
		}
	}
	
	public void displayPassengersList() {
		System.out.println("\n-Display Passengers List.");
		if(!passengersList.isEmpty()) {
		passengersList.forEach(System.out::println);
		}else {
			System.out.println("There is still no passengers in this Flight.");
		}
	}
	
	public double calculateTotalRevenue() {
		System.out.println("\n-Calculate Total Revenue.");
		double total = 0;
		for(Passenger passenger : passengersList) {
			total += passenger.getTicketPrice();
		}
		System.out.println("Total revenue: €" + total);
		return total;
	}
}
