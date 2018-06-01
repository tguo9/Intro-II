/**
	This is a class hold the Pokemon in ArrayList.
	@author Tao Guo
**/

import java.util.ArrayList;

public class Pokedex {

	private ArrayList<Pokemon> pokemon;

	public Pokedex () {
		this.pokemon = new ArrayList<Pokemon>();
	}

	public void addPokemon(Pokemon pokemon) {
		this.pokemon.add(pokemon);
	}
	
	public String toString() {

		String returnVal = "";

		for(Pokemon poke: this.pokemon) {

			returnVal += poke.toString() + "\n";
		}

		return returnVal;
	}

	public double averageHeight() {

		double totalHeight = 0;

		for(Pokemon p: this.pokemon) {

			totalHeight += p.getHeight();
		}

		double result = (totalHeight) / pokemon.size();

		return result;
	}

	public double averageWeight() {

		double totalWeight = 0;

		for(Pokemon p: this.pokemon) {

			totalWeight += p.getWeight();
		}

		double result = (totalWeight) / pokemon.size();

		return result;
	}

	public double averageExperience() {

		double totalExperience = 0;

		for(Pokemon p: this.pokemon) {

			totalExperience += p.getExperience();
		}

		double result = (totalExperience) / pokemon.size();

		return result;
	}

	public String tallest() {
 
		int tallMax = Integer.MIN_VALUE;
		String speciesMax = null;
		
		for(Pokemon p: this.pokemon) {

			if(p.getHeight() > tallMax) {
				tallMax = p.getHeight();
				speciesMax = p.getSpecies();
			}
		}

		return speciesMax;

	}

	public String smallest() {

		int tallMin = Integer.MAX_VALUE;
		String speciesMin = null;
		
		for(Pokemon p: this.pokemon) {

			if(p.getHeight() < tallMin) {
				tallMin = p.getHeight();
				speciesMin = p.getSpecies();
			}
		}

		return speciesMin;
	}

	//Get help from TA.
	public ArrayList<Pokemon> mostExperienced(int level) {

		ArrayList<Pokemon> greaterExperienced = new ArrayList<Pokemon>();

		for(Pokemon p: this.pokemon) {

			if(p.getExperience() > level) {

				greaterExperienced.add(p);
			}

			
		}

		return greaterExperienced;

	}


	
}