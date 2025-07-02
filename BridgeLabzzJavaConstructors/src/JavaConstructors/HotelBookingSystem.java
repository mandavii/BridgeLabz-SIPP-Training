package JavaConstructors;

class HotelBooking {
	private String guestName;
	private String roomType;
	private int nights;
	
	public HotelBooking() {
		this.guestName = "guest";
		this.roomType = "standard";
		this.nights = 1;
		System.out.println("Default Created");
	}
	
	public HotelBooking(String guestName, String roomType, int nights) {
		
		this.guestName = guestName;
		this.roomType = roomType;
		
		if(nights >0) {
			this.nights = nights;
		}else {
			this.nights = 1;
			System.out.println("Warning: defaulting to 1 night");
		}
		System.out.println("Parameterized for" +guestName);
	}
	
	public HotelBooking(HotelBooking otherBooking) {
		this.guestName = otherBooking.guestName;
		this.roomType = otherBooking.roomType;
		this.nights = otherBooking.nights;
		System.out.println("copying booking created from" + otherBooking.guestName);
		
	}
	
	public void displayDetails() {
		System.out.println("Name "+ guestName);
		System.out.println("roomtype "+ roomType);
		System.out.println("nights "+ nights);
	}
	
	
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public void setNights(int nights) {
		if(nights >0) {
			this.nights = nights;
		}else {
			System.out.println("negative nights?");
		}
	}
	
	
	public String getGuestName() {
		return guestName;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public int getNights() {
		return nights;
	}
	
	
	
}



public class HotelBookingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HotelBooking booking1 = new HotelBooking();
		booking1.displayDetails();
		
		HotelBooking booking2 = new HotelBooking("Alex", "Deluxe", 5);
		booking2.displayDetails();

		HotelBooking booking3 = new HotelBooking("John", "ultra Delux", -2);
		booking3.displayDetails();
		
		
		HotelBooking booking4 = new HotelBooking(booking2);
		booking4.displayDetails();
		
		System.out.println("modifying booking2");
		booking2.setGuestName("Red");
		booking2.setNights(2);
		booking2.setRoomType("superUtlraDelux");
		booking2.displayDetails();
		
		
		booking4.displayDetails();
		
		
		

	}

}
