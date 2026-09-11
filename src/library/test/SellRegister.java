package library.test;

import library.Ebook;
import library.PrintedBook;
import library.ShoppingCart;
import library.bookstore.Author;

public class SellRegister {
	
	public static void main(String args[]) {
		
		Author author = new Author();	
		PrintedBook printedBook1 = new PrintedBook(author);
		Ebook ebook1 = new Ebook(author);
		
		printedBook1.setTitle("Toupeiras Texugo");
		ebook1.setTitle("Marcos Fontes");
		
		printedBook1.setPrice(69.99);
		ebook1.setPrice(15.77);
		
		double discount = 0.2;
		
	
		printedBook1.showDetails();
	
		if(!printedBook1.appliesDiscount(discount)){
			System.out.println("Discount can't be higher than 30% for Printed Books!");
		}else {
			printedBook1.appliesDiscount(discount);
			System.out.println("Discount of " + discount*100 + "% has been applied for " + printedBook1.getTitle());
			System.out.println("New price of the product: " + printedBook1.getPrice());
		}
			
		
		if(!ebook1.appliesDiscount(discount)){
			System.out.println("Discount can't be higher than 15% for Ebooks! ");
		}else{
			ebook1.appliesDiscount(discount);
			System.out.println("Discount of " + discount*100 + "% has been applied for " + ebook1.getTitle());
			System.out.println("New price of the product: " + ebook1.getPrice());
		}
		
		ShoppingCart cart = new ShoppingCart();
		
		cart.addProduct(printedBook1);
		cart.addProduct(ebook1);
	
		System.out.println("Total " + cart.getTotal());
	}
}
