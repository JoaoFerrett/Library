package library;

public class Book {
	
	private double price;
	private String title;
	private String description;
	private String id;
	private Author author;
	
	public Book() {
		System.out.println("A new book has benn created! ");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getDescription(){
		return description;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

	public Author geAuthor(){
		return author;
	}

	public void setAuthor(Author author){
		this.author = author;
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
