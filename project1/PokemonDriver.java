/**
	A driver class to test the Pokemon class.
	@author Tao Guo
**/

import java.util.ArrayList;

public class PokemonDriver {

	public static void main(String[] args) {
		
		PokedexBuilder builder = new PokedexBuilder();
		
		if(args.length != 1) {					
				System.out.println("usage: java FileInputCSV <filename>");
				System.exit(1);				
			}

		Pokedex list = builder.buildPokedex(args[0]);

		if(list == null) {

			System.out.println("Error, the file was not found.");
			System.exit(0);
		}


		int level = 200;
		
		System.out.println("All Pokemon:");
		System.out.println(list.toString());

		System.out.printf("Average Height: %3.1f \n", list.averageHeight());
		System.out.printf("Average Weight: %3.1f \n", list.averageWeight());
		System.out.printf("Average Experience: %3.1f \n", list.averageExperience());
		
		System.out.println("Species of Tallest: " + list.tallest());
		System.out.println("Species of Smallest: " + list.smallest());
		
		ArrayList<Pokemon> greaterExperienced = list.mostExperienced(level);

		//Get help from TA.
		System.out.println("Pokemon with experience greater than " + level + ": ");

		for(Pokemon p: greaterExperienced) {

			System.out.println(p);
		}
	}


}