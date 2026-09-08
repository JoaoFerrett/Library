package library;

public class ShoppingCart {
	
	private double total;
	
	public void addBook(Book book) {
		System.out.println("Adding " + book.getTitle() + " to your cart");
		book.aplliesDiscount(0.05);
		total += book.getPrice();	
	}
	
	public double getTotal() {
		return total;
	}
	
	
	
}
