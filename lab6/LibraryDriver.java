/**
	A driver for the Publication, Magazine, Book.
	@author Tao Guo
**/

import java.util.ArrayList;
import java.util.Collections;

public class LibraryDriver {
	
	public static void main(String[] args) {

		ArrayList<Publication> library = new ArrayList<Publication>();

		Publication b1 = new Book("Harry Potter", 200, true);
		Publication b2 = new Book("Catcher In The Rye", 300, false);
		Publication b3 = new Book("To Kill A Mocking Bird", 149, true);

		Publication m1 = new Magazine("National Geographic", 50, 200000);
		Publication m2 = new Magazine("PEOPLE", 60, 500000);
		Publication m3 = new Magazine("Time", 70, 600000);

		library.add(b1);
		library.add(b2);
		library.add(b3);
		library.add(m1);
		library.add(m2);
		library.add(m3);

		Collections.sort(library);

		for(Publication publication: library) {

				System.out.println(publication);

		}
	}
}