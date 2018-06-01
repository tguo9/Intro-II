/**
	A class will print the word and whether it is or is not a palindrome.
	@author Tao Guo
**/

public class PalindromeTester {

	public static boolean isPalindrome(String word) {

		if(word.length() < 2) {
			return true;
		} else {

			if(word.charAt(0) != word.charAt(word.length() - 1)) {
				return false;
			} else {
				return isPalindrome(word.substring(1, word.length() - 1));
			}
		}
	}

	public static void main(String[] args) {

		if(args.length != 1) {					
				System.out.println("usage: java PalindromeTester <word>");
				System.exit(1);				
		}

		String word = args[0];

		boolean returnVal = isPalindrome(word);

		if(returnVal == true) {
			System.out.println(word + " is a palindrome.");
		} else {
			System.out.println(word + " is not a palindrome.");
		}
		
	}
}