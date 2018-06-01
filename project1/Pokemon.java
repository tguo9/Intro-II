/**
	This is a program about Pokemon.
	@author Tao Guo
**/

public class Pokemon {
	
	//Data members
	private String species;
	private int height;
	private int weight;
	private int experience;
	private boolean favorite;

	//Constructor
	public Pokemon(String species, int height, int weight, int experience) {
			this.species = species;
			this.height = height;
			this.weight = weight;
			this.experience = experience;
			this.favorite = false;
	}

	//Methods: getters
	public String getSpecies() {
		return this.species;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWeight() {
		return this.weight;
	}

	public int getExperience() {
		return this.experience;
	}

	public boolean getFavorite() {
		return this.favorite;
	}

	//Print out different cases
	public String toString() {
		if(favorite == true) {
			return this.species + "(" + this.height + ", " + this.weight + ") with Experience " + this.experience + " - Starred";
		} else {
			return this.species + "(" + this.height + ", " + this.weight + ") with Experience " + this.experience + " - Not Starred";
		}
	}

}