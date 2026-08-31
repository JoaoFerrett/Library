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
	
	public boolean aplliesDiscount(double porcentage) {
		
		if(porcentage > 0.3){
			return false;
		}
		this.price -= this.price * porcentage;
		return true;
	}
		
	boolean hasAuthor() {
		return this.author != null;
	}
	
	
}
