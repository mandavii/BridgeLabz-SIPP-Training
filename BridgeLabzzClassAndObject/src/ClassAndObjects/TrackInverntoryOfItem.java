package ClassAndObjects;

class Item{
	private double itemCode;
	private String itemName;
	private double price;
	
	public Item(double itemCode, String itemName, double price) {
		this.itemCode= itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	public void displayDetails() {
		System.out.println("Code"+ String.format("%.2f", itemCode));
		System.out.println("name" + itemName);
		System.out.println("price"+ String.format("%.2f", price));
	}
}



public class TrackInverntoryOfItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Item item1 = new Item(2234.9, "BoB The Builder", 33.45);
		item1.displayDetails();

	}

}
