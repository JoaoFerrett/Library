package library;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

import library.products.Product;

public class ShoppingCart {
	
	private double total;
	private ArrayList<Product> products;
	
	public ShoppingCart(){
		this.products = new ArrayList<>();
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

	public void removeProduct(Product product){
		this.products.remove(product);
	}

	public ArrayList<Product> geProducts(){
		return products;
	}
	
	public double getTotal() {
		return total;
	}
	
	
	
}
