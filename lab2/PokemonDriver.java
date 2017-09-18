/**
	A driver class to test the Pokemon class.
	@author Tao Guo
**/

public class PokemonDriver {

	public static void main(String[] args) {

		//Create 3 Pokemon objects
		Pokemon p1 = new Pokemon("Zubat", 137, true);
		Pokemon p2 = new Pokemon("Oddish", 220, false);
		Pokemon p3 = new Pokemon("Pikachu", 100, true);

		//Print out the Pokemon objects
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

		//Set 3 different Pokemon
		p1.setSpecies("Charmeleon");
		p1.setExperience(110);
		p1.setFavorite(false);

		p2.setSpecies("Charizard");
		p2.setExperience(250);
		p2.setFavorite(true);

		p3.setSpecies("Squirtle");
		p3.setExperience(300);
		p3.setFavorite(false);

		//Print the Pokemon after set
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

	}
}