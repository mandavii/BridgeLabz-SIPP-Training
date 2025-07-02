package ClassAndObjects;

class MobilePhone{
	private String brand;
	private String model;
	private double price;
	
	public MobilePhone(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("brand" + brand);
		System.out.println("model" + model);
		System.out.println("price" + String.format("%.2f", price));

	}
	
}




public class MobilePhoneDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MobilePhone mobile = new MobilePhone("samsung", "galaxy s24", 43999.89);
		mobile.displayDetails();
		
		
	}

}
