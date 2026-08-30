package library;

public class Author {
	
	String name;
	String birthDate;
	String deathDate;
	String placeOfBirth;
	
	void showDetails() {
		
		System.out.println("Author's name: " + name);
		System.out.println("Was born in: " + placeOfBirth);
		System.out.println("Born on: " + birthDate);
		
		if(deathDate != null) {
		System.out.println("Gone on: " + deathDate);
		}
		
		System.out.println("---------------");


	}
}
