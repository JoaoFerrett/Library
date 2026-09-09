package library;

public class PrintedBook extends Book implements Promotional {
	
	public PrintedBook(Author author) {
		super(author);
	}
	
	public double getPrintRate() {
		return this.getPrice() * 0.05;
	}

	@Override
	public boolean appliesDiscount(double porcentage){
		if(porcentage > 0.3){
			return false;
		}
		double discount = getPrice() * porcentage;
		setPrice(getPrice() - discount);
		return true;
	}
	
}
