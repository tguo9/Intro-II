/**
	A class with utility methods for manipulating one and two dimensional
	arrays of characters.
	@author Tao Guo
**/
public class ArrayUtilities { 

	/*
		Determines whether the 2D array is square. The array 
		is square if the length of every row is the same. 
		Returns true if the array is square and false
		otherwise. The solution may not make any assumptions about
		the number of rows or columns in original.		
	*/
	public static boolean isSquare(char[][] original) {
		//Check if row == col.
		int row1 = original.length;
		int col1 = 0;

		for(int row = 0; row < original.length; row++) {
			for(int col = 0; col < original[row].length; col++) {
				col1 = original[row].length;
			}
		}

		if(row1 == col1) {
			return true;
		} else {
			return false;
		}
	}

	/*
		Converts a two dimensional array of char to a one 
		dimensional array of char. This method may assume
		that all subarrays of the original are of the same
		length.
		Returns the one dimensional array.
		Example input: 
		[['a', 'b', 'c']
		 ['e', 'd', 'f']
		 ['i', 'h', 'g']]
		 Example output:
		 ['a', 'b', 'c', 'e', 'd', 'f', 'i', 'h', 'g']
	*/
	public static char[] to1D(char[][] original) {
		//Get help with TA.
		int totalLength = 0;
		for(int row = 0; row < original.length; row++) {
			totalLength += original[row].length;
		}

		char[] oneDArray = new char[totalLength];
		int oneDIndex = 0;
		
		for(int row = 0; row < original.length; row++) {
			for(int col = 0; col < original[row].length; col++) {
				oneDArray[oneDIndex] = original[row][col];
				oneDIndex++;
				//oneDArray[oneDIndex++] = original[row][col];
			}
		}

		return oneDArray;
	}

	/*
		Finds the char with the smallest value in each row
		of the original and returns an array containing the 
		values found. the result at position [0] will be the
		smallest valued char in row 0 of original.
		This method does NOT assume that all subarrays of the
		original are of the same length.
		Example input:
		[['e', 'c', 'f', 'g', 'c', 'e']
		 ['b', 'b', 'b', 'b']
		 ['a', 'd']
		 ['d', 'c', 'b']]
		Example output:
		['c', 'b', 'a', 'b']
	*/
	public static char[] smallestPerRow(char[][] original) {
		//Finding the smallest char per row.
		char[] smallestArray = new char[original.length];

		for(int row = 0; row < original.length; row++) {
			char tempMin = original[row][0];
			for(int col = 0; col < original[row].length; col++) {
				char temp = original[row][col];
				if(temp < tempMin) {
					tempMin = temp;
				}
			}
			smallestArray[row] = tempMin;
		}
		return smallestArray;
	}

}