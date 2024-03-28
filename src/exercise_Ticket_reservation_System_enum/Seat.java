package exercise_Ticket_reservation_System_enum;

public enum Seat {
	FIRST_CLASS(1850, "First Class"), BUSINESS_CLASS(685, "Bussines Class"), ECONOMY_CLASS(320, "Economy Class");
	
	private double price;
	private String name;
	
	Seat(double price, String name){
		this.price = price;
		this.name = name;
	}

	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	
}
