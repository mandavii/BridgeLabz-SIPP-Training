package JavaConstructors;


class Book{
	private String title;
	private String author;
	private double price;
	private boolean isAvailable;
	
	
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.isAvailable = true;
		System.out.println("book" + title + "by" + author);
	}
	
	public void displayDetails() {
		System.out.println("name"+title);
		System.out.println("author" + author);
		System.out.println("price" + String.format("%.2f"+ price));
		System.out.println("Availability"+ (isAvailable ? "Available" : "Borrowed"));

	}
	
	public void borrowBook() {
		if(isAvailable) {
			this.isAvailable = false;
			System.out.println("Success");
		}
		else {
			System.out.println("fail; book is borrowed");
		}
	}
	
	public void returnBook() {
		if(!isAvailable) {
			this.isAvailable = true;
			System.out.println("Succesfully returned");
		} else {
			System.out.println("was already available");
		}
	}

	
	public String getTitle() {
		return title;
	}
	
	
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void setPrice(double price) {
		if(price >=0) {
			this.price = price;
		}
		else {
			System.out.println("error");
		}
	}
}


public class LibraryBookSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 12.99);
        Book book2 = new Book("1984", "George Orwell", 9.50);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 15.75);

        
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();

        book1.borrowBook(); 
        book1.displayDetails();

        book2.borrowBook(); 
        book2.displayDetails();

        
        
        
        
        
        
	}

}
