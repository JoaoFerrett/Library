package library;

public class SellRegister {
	
	public static void main(String args[]) {
		
		Author author = new Author();	
		Book book1 = new PrintedBook(author);
		Ebook ebook1 = new Ebook(author);
		
		book1.setTitle("Toupeiras Texugo");
		ebook1.setTitle("Marcos Fontes");
		
		book1.setPrice(69.99);
		ebook1.setPrice(15.77);
		
		double discount = 0.2;
		
	
		book1.showDetails();
	
		if(!book1.aplliesDiscount(discount)){
			System.out.println("Discount can't be higher than 30% for Printed Books!");
		}else {
			book1.aplliesDiscount(discount);
			System.out.println("Discount of " + discount*100 + "% has been applied for " + book1.getTitle());
			System.out.println("New price of the product: " + book1.getPrice());
		}
			
		
		if(!ebook1.aplliesDiscount(discount)){
			System.out.println("Discount can't be higher than 15% for Ebooks! ");
		}else{
			ebook1.aplliesDiscount(discount);
			System.out.println("Discount of " + discount*100 + "% has been applied for " + ebook1.getTitle());
			System.out.println("New price of the product: " + ebook1.getPrice());
		}
		
		ShoppingCart cart = new ShoppingCart();
		
		cart.addBook(book1);
		cart.addBook(ebook1);
	
		System.out.println("Total " + cart.getTotal());
	}
}
