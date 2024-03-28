package exercise_Ticket_reservation_System_enum;

public class Main {

	public static void main(String[] args) {
		
		Flight flight = new Flight();
		Passenger maria = new Passenger("Maria Ibanez", Seat.ECONOMY_CLASS);
		Passenger adriana = new Passenger("Adriana Ibanez", Seat.FIRST_CLASS);
		Passenger daniel = new Passenger("Daniel Nitzschke", Seat.ECONOMY_CLASS);
		Passenger omar = new Passenger("Omar Ibanez", Seat.FIRST_CLASS);
		Passenger mariajose = new Passenger("Maria Jose Rubio", Seat.BUSINESS_CLASS);
		
		
		flight.displayPassengersList();
		flight.cancelReservation(maria);
		flight.reserveSeat(maria);
		flight.reserveSeat(maria);
		flight.reserveSeat(adriana);
		flight.reserveSeat(omar);
		
		flight.displayPassengersList();
		flight.reserveSeat(mariajose);
		flight.reserveSeat(daniel);
		flight.calculateTotalRevenue();
		
		flight.cancelReservation(maria);
		flight.cancelReservation(daniel);
		
		flight.calculateTotalRevenue();
	}

}
