/**
	A class will implement the rock-paper-scissors game where the user plays against the computer.
	@author Tao Guo
**/

//import the methods.
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static String convertTo(int input) {

		String convert = null;

		if (input == 1) {
			convert = "Rock";
		} else if (input == 2) {
			convert = "Paper";
		} else if (input == 3) {
			convert = "Scissors";
		}

		return convert;
	}

	public static void main(String[] args) {

		//Using While loop to loop the game until user input 0
		
		boolean notZero = true;

		while (notZero == true) {

			//Get user input
			Scanner in = new Scanner(System.in);

			System.out.println("Enter 1 (Rock), 2 (Paper), or 3 (Scissors) - Enter 0 to exit: ");
			int userChoice = in.nextInt();

			//Using if, else if, else, to check the result
			if (userChoice == 0) {
				System.out.println("Game over.");
				notZero = false;
			} else if (userChoice > 3 || userChoice < 0) {
				System.out.println("Invalid input.");
			} else {
				
				//Get random number as computer's choice
				Random r = new Random();
				int computerChoice = r.nextInt(3) + 1;

				//Print out the users input, and the computer's chioce
				//Print the game result, win, lose or tie
				if (userChoice == computerChoice) {
					System.out.println("Player chooses " + convertTo(userChoice) + ". Computer chooses " + convertTo(computerChoice) + ".");
					System.out.println("It's a tie!");
				} else if (((userChoice == 1) && (computerChoice == 3) )|| ((userChoice == 2) && (computerChoice == 1)) || ((userChoice == 3) && (computerChoice == 2))) {
					System.out.println("Player chooses " + convertTo(userChoice) + ". Computer chooses " + convertTo(computerChoice) + ".");
					System.out.println("Player wins!");
				} else {
					System.out.println("Computer chooses " + convertTo(computerChoice) + ".  Player chooses " + convertTo(userChoice) + ".");
					System.out.println("Computer wins!");
				}

			}

		}

	}
}