package library;

import library.products.Promotional;
import library.bookstore.*;;

public class Ebook extends Book implements Promotional{
	
	private String waterMark;
	
	public Ebook(Author author) {
		super(author);
	}
	
	public String getWaterMark() {
		return waterMark;
	}
	
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	@Override
	public boolean appliesDiscount(double porcentage) {
		
		if(porcentage > 0.15) {
			return false;	
		}
		
		double discount = this.getPrice() * porcentage;
		this.setPrice(this.getPrice() - discount);
		return true;
	}
    
}