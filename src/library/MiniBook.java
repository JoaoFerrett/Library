package library;

import library.bookstore.Author;
import library.products.Promotional;

public class MiniBook extends Book implements Promotional{

    public MiniBook(Author author){
        super(author);
    }
    
    public boolean appliesDiscount(double porcentage){
        return false;
    }


    
}
