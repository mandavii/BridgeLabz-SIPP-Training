package JavaConstructors;
 
import java.util.Scanner;



class Book{
	private String title;
	private String author;
	private double price;
	
	
	public Book() {
		this.title = "Untitled book";
		this.author = "Anonymous";
		this.price = 0.0;
		System.out.println("A default is created");
	}
	
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		System.out.println("A parameterized book object is created" + title);
	}
	
	public void displayDetails() {
		System.out.println("Title "+ this.title);
		System.out.println("Author " + this.author);
		System.out.println("price " + String.format("%.2f", this.price));
	}
}





public class BookClassL1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter book name");
		String userInput = input.nextLine();
		
		
		System.out.println("Title");
		String newTitle = input.nextLine();

		System.out.println("Author");
		String newAuthor = input.nextLine();
		System.out.println("Price");
		String newPrice = input.nextLine();
		
		
		Book book1 = new Book();
		book1.displayDetails();
		
		input.close();
		
		
		
		
	}

}
