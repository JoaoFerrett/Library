package library;

public class Author {
	
	private String name;
	private String birthDate;
	private String deathDate;
	private String placeOfBirth;
	
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getBirthDate(){
		return birthDate;
	}

	public void setBirthDate(String birthDate){
		this.birthDate = birthDate;
	}

	public String getDeathDate(){
		return deathDate;
	}

	public void setDeathDate(String deathDate){
		this.deathDate = deathDate;
	}

	public String getPlaceOfBirth(){
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth){
		this.placeOfBirth = placeOfBirth;
	}
	
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
