package library;

public class PrintedBook extends Book {
	
	public PrintedBook(Author author) {
		super(author);
	}
	
	public double getPrintRate() {
		return this.getPrice() * 0.05;
	}
	
}
