package library;

public class PrintedBook extends Book {
	
	public PrintedBook(Author author) {
		super(author);
	}
	
	public double getPrintRate() {
		return this.getPrice() * 0.05;
	}

	@Override
	public boolean aplliesDiscount(double porcentage){
		if(porcentage > 0.3){
			return false;
		}
		double discount = getPrice() * porcentage;
		setPrice(getPrice() - discount);
		return true;
	}
	
}
