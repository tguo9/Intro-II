/**
	This is a program that that will convert cups to tablespoons.
	@author Tao Guo
**/

	import java.util.Scanner;

	public class CooksHelper {

		public static void main(String[] args) {

			//Take input from user
			Scanner in = new Scanner(System.in);
			System.out.println("Enter number of Tablespoons: ");
			int numTablespoons = in.nextInt();

			//Convert cups to tablespoons
			double numCups = ((double)numTablespoons/16);

			//Print the result
			System.out.println(numTablespoons + " tablespoons is equal to " +  numCups + " cups.");
		
		}
	}