package library;

public class MiniBook extends Book implements Promotional{

    public MiniBook(Author author){
        super(author);
    }
    
    public boolean appliesDiscount(double porcentage){
        return false;
    }


    
}
