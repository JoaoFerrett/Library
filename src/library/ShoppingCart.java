package library;

import library.products.Product;

public class ShoppingCart {
	
	private double total;
	private Product[] products = new Product[10];
	//private int counter = 0; for now has no use
	
	public void addProduct(Product product1) {

		System.out.println("Adding to your cart");

		for(int i = 0; i < products.length; i++){
			try{
				Product product = products[i];
				if(product != null){
					System.out.println("+ $:" + product.getPrice());
				}
					this.total += products[i].getPrice();

			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array Index blablabla");
			}
			
		}
	}
	
	public double getTotal() {
		return total;
	}
	
	
	
}
