package library;

public class Main {
	
	public static void main(String args[]) {
		
	Author author = new Author();	
	Book book1 = new Book(author);
	double Discount = 0.2;


	book1.showDetails();

	if(!book1.aplliesDiscount(Discount)){
		System.out.println("Discount can't be higher than 30%! ");
	}else
		book1.aplliesDiscount(Discount);
	
	}
}
