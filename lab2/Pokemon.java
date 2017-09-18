/**
	This is a program about Pokemon.
	@author Tao Guo
**/

public class Pokemon {
	
	//Data members
	private String species;
	private int experience;
	private boolean favorite;

	//Constructor
	public Pokemon(String species, int experience, boolean favorite) {
			this.species = species;
			this.experience = experience;
			this.favorite = favorite;
	}

	//Methods: getter
	public String getSpecies() {
		return this.species;
	}

	public int getExperience() {
		return this.experience;
	}

	public boolean getFavorite() {
		return this.favorite;
	}

	//Methods: setters
	public void setSpecies(String newSpecies) {
		this.species = newSpecies;
	}

	public void setExperience(int newExperience) {
		this.experience = newExperience;
	}

	public void setFavorite(boolean newFavorite) {
		this.favorite = newFavorite;
	}

	//Print out different cases
	public String toString() {
		if(favorite == true) {
			return this.species + " with Experience " + this.experience + " - Starred";
		} else {
			return this.species + " with Experience " + this.experience + " - Not Starred";
		}
	}

}