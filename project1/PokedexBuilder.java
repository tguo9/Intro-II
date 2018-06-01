/**
	A class that will construct a Pokedex object from
	a given CSV file.
	@author Tao Guo
**/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PokedexBuilder {	

	public Pokedex buildPokedex(String filename) {

		//Crate a new list.
		Pokedex list = new Pokedex();

		//Open the CSV file.
		File inputFile = new File(filename);

		//read in each line of file
		try(Scanner input = new Scanner(inputFile)) {
			input.useDelimiter(",|\n");

			input.nextLine();
			// input.next();
			// input.next();
			// input.next();
			// input.next();
			// input.next();
			// input.next();
			// input.next();
			// input.next();
			
			//Get help from TA and Tutor.
			while(input.hasNext()) {
				input.next();
				String species = input.next();
				input.next();
				int height = input.nextInt();
				int weight = input.nextInt();
				int experience = input.nextInt();
				input.next();
				input.next();

				//Crate a new Pokemon.
				Pokemon pokemon = new Pokemon(species, height, weight, experience);
				//Add Pkoemon to list.
				list.addPokemon(pokemon);
				
			}


		} catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
			return null;
		}
		
		//Return list.
		return list;
	}

}