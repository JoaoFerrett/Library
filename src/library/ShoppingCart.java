package library;

public class ShoppingCart {
	
	private double total;
	
	public void addBook(Product product) {
		System.out.println("Adding to your cart");
		total += product.getPrice();	
	}
	
	public double getTotal() {
		return total;
	}
	
	
	
}
