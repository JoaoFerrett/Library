package library;

public class Book {
	
	double price;
	String title;
	String description;
	String id;
	Author author;
	
	public Book() {
		System.out.println("A new book has benn created! ");
	}
	
	void showDetails() {
		
		System.out.println("Showing book details: ");
		System.out.println("Book Title: " + title);
		System.out.println("Book Description: " + description);
		System.out.println("Book id: " + id);
		
		if(this.hasAuthor()) {
			author.showDetails();
		}
	
		System.out.println("---------------");

	}
	
	public void aplliesDiscount(double porcentage) {
		this.price -= this.price * porcentage;
	}
		
	boolean hasAuthor() {
		return this.author != null;
	}
	
	
}
