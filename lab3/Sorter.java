/**
	This is a program that reads the contents of a text file, stores each word in an ArrayList, sorts the list, then prints the contents in order smallest to largest and largest to smallest.
	@author Tao Guo
**/

//Import methods.
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Sorter {

	public static void main(String[] args) {
		
		//Open the file "words.txt".
		File inputFile = new File("words.txt");

		//Create a new ArrayList call ed words.
		ArrayList<String> words = new ArrayList<String>();

		// Using the sample code in class to read the file.
		try (Scanner input = new Scanner(inputFile)) {

			while(input.hasNext()) {

				String word = input.nextLine();				
				words.add(word);
			}

		} catch(FileNotFoundException fnf) {
			System.out.println("File not found.");
			System.out.println(fnf.getMessage());
			System.exit(1);
		}

		//Using Collections to sort the words.
		Collections.sort(words);

		//Using the loop to print the sorted words.
		System.out.println("Alphabetical A-Z:");

		for(String word: words) {
			System.out.println(word);
		}

		System.out.println("");

		//Using the loop to print the revse the words.
		System.out.println("Alphabetical Z-A:");

		for(int i = words.size() - 1; i > -1; i--){
			String tmpWords = words.get(i);
			System.out.println(tmpWords);
		}

	}
}