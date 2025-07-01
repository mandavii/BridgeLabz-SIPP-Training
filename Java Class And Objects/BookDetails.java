package ClassAndObjects;

class Book {
	private String BookName;
	private String Author;
	private double price;
	
	public Book(String BookName, String Author, double price ) {
		this.BookName = BookName;
		this.Author = Author;
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("name-"+ BookName);
		System.out.println("autor-"+ Author);
		System.out.println("price-"+ String.format("%.2f", price));
	}

}



public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Book book1 = new Book("They Both Died At The End", "Adam Silvera", 1369.89);
		book1.displayDetails();

	}

}
