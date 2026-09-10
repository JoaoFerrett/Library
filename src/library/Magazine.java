package library;

import library.products.Product;
import library.bookstore.*;

public class Magazine implements Product{

    private double price;
    private Publisher publisher;

    public Magazine(Publisher publisher){
        this.publisher = publisher;
    }

    public double getPrice(){
    return price;  
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Publisher getPublisher() {
        return publisher;
    }



}
