/**
	This is a program that take a number as input from user, and different may have different output.
	If the number is divisible by 3 print apple.
	If the number is divisible by 7 print orange.
	If the number is divisible by 3 and 7 print appleorange.
	If the number is out of range (not between 1 and 100) print banana.
	In all other cases simply print the number.

	@author Tao Guo
**/

	import java.util.Scanner;

	public class AppleOrange {

		public static void main(String[] args) {

			//Take input from user
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter a number between 1 and 100: ");
			int number = in.nextInt();
			
			//Check if the number is divisible by 3 or 7
			double div3 = number % 3;
			double div7 = number % 7;

			//Set the initial output is null
			String output = null;

			//if, else if, else statement to check different cases
			//print different thing for different cases
			if(number > 100 || number < 1) {
				output = "banana";
			} else if (div3 == 0 && div7 != 0) {
				output = "apple";
			} else if(div7 == 0 && div3 != 0) {
				output = "orange";
			} else if (div3 == 0 && div7 == 0) {
				output = "appleorange";
			} else {
				output = Integer.toString(number);
			}

			//Print the result
			System.out.println(output);

		}

	}