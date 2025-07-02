package ClassAndObjects;

class MovieTicket{

	private String movieName;
	private String seatNumber;
	private double price;
	private boolean isBooked;


	public MovieTicket(String movieName) {
		this.movieName = movieName;
		this.seatNumber = "N/A";
		this.price = 0.0;
		this.isBooked = false;
	}


	public boolean bookTicket(String seatNumber, double price) {
		if(this.isBooked) {
			System.out.println("Error: This ticket is already booked for movie - " + movieName);
			return false;
		}

		if(price <=0) {
			System.out.println("Error: Ticket price must be positive.");
			return false;
		}

		this.seatNumber = seatNumber;
		this.price = price;
		this.isBooked = true;
		System.out.println("Success: Ticket booked successfully for movie - " + movieName);
		return true;
	}

	public void displayDetails() {
		
		
		System.out.println("Movie: " + movieName);
		System.out.println("Seat Number: " + seatNumber);
		System.out.println("Price: $" + String.format("%.2f", price));
		System.out.println("Status: " + (isBooked ? "BOOKED" : "AVAILABLE (Not Booked Yet)"));
		
		
	}
}


public class MovieTicketBookingSystem {

	public static void main(String[] args) {
		MovieTicket ticket1 = new MovieTicket("Inception");

	        ticket1.displayDetails();

	        ticket1.bookTicket("A5", 15.50);
	        ticket1.displayDetails();

	        System.out.println("re-book ticket1");
	        ticket1.bookTicket("B7", 12.00);
	        ticket1.displayDetails();

	        
	        
	        MovieTicket ticket2 = new MovieTicket("The Matrix");
	        ticket2.displayDetails();

	        ticket2.bookTicket("C10", 18.00);
	        ticket2.displayDetails();

	        MovieTicket ticket3 = new MovieTicket("Interstellar");
	        System.out.println("book ticket3 with invalid price");
	        ticket3.bookTicket("D1", -5.00);
	        ticket3.displayDetails();
	}
}
