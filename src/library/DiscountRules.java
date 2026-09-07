package library;

public class DiscountRules {
	
	public static void main(String args[]) {
		
	Author author = new Author();	
	Book book1 = new Book(author);
	
	double discount = 0.2;
	

	book1.showDetails();

	if(!book1.aplliesDiscount(discount)){
		System.out.println("Discount can't be higher than 30%! ");
	}else
		book1.aplliesDiscount(discount);
		System.out.println("Discount of" + discount*100 + "% has been applied!");
	
		
	Ebook ebook1 = new Ebook(author);
	
	if(!ebook1.aplliesDiscount(discount)){
		System.out.println("Discount can't be higher than 30%! ");
	}else
		ebook1.aplliesDiscount(discount);
		System.out.println("Discount of" + discount*100 + "% has been applied for " + ebook1.getTitle());
	
	
	}
}
