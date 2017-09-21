/**
	A class providing ArrayList-like functionality for a list of String objects.
	@author Tao Guo
**/
public class StringList {

	//declare data members to hold an array of strings and an
	//int to keep track of the number of items in the list
	private String[] words;
	private int count;

	/*
		A constructor that takes no input and instantiates a new
		String[] of size 10.
	*/
	public StringList() {
		//YOUR CODE HERE
		this.count = 0;
		this.words = new String[10];
	}

	/*
		A constructor that takes a size and instantiates a new
		String[] of size size.
	*/
	public StringList(int size) {
		//YOUR CODE HERE
		this.count = 0;
		this.words = new String[size];

	}

	/*
		Adds the new item s to the end of the array.
		In case the array is full, 
		it will be resized by creating new array of 
		twice the size and copying all elements to 
		the new array.
	*/
	private void resize() {

		String[] tmpWords = new String[count*2];

		for(int i = 0; i < count; i++) {
			tmpWords[i] = words[i];
		}

		words = tmpWords;

	}

	public void add(String s)  {
		
		if(count == words.length) {
			resize();
		}
		words[count] = s;
		count++;
		
	}
	
	/*
		Adds the new item to the array at the location 
		specified by index, in case the array is full, 
		it will be resized by creating new array of 
		twice the size and copying all elements to the
		new array.
	*/
	public void add(int index, String s) {

		if(index < words.length && index > 0) {
			for(int i = index; i < count; i++) {
				words[i + 1] = words[i];
			}
			words[index] = s;
			count++;
		}
		
		if(count == words.length) {
			resize();
		}
		
		
	}

	/*
		Returns a string representation of the array.
		Following is an example of the expected format:
		{A,B,C,D,E}
		For full credit your solution must iterate over
		the array and build the string. 
	*/
	public String toString() {

		String returnVal = "{";
		for(int i = 0; i < count; i++) {
			if(i != count - 1) {
				returnVal += words[i] + ",";
			} else {
				returnVal += words[i];
			}
		}
		return returnVal + "}";	
	}


	/*
		Returns true if the array contains the string s
		and false otherwise.
	*/
	public boolean contains(String s) {

		for(int i = 0; i < count; i++) {
			if(words[i].equals(s)) {
				return true;
			} 
		}
		return false;
	}

	/*
		Returns true if there are no elements in the array
		and false otherwise.
	*/
	public boolean isEmpty() {

		if(count == 0) {
			return true;
		} else {
			return false;
		}
		
	}

	/*
		Returns the number of elements in the array. Note this
		is not the total number of spaces in the array, but 
		the total number of valid elements.
	*/
	public int size() {

		int returnSize = count;
		return returnSize;
	}

	/*
		Returns the first index of the given String,
		or -1 if not found.
	*/
	public int indexOf(String s) {

		int returnIndex = 0;
		for(int i = 0; i < count; i++) {
			if(words[i].equals(s)) {
				returnIndex = i;
				return returnIndex;
			} else {
				returnIndex = -1;
			}
		}
		return returnIndex;
	}

	/*
		Returns the last index of the given String, 
		or -1 if not found.
	*/
	public int lastIndexOf(String s) {

		int returnIndex = 0;
		for(int i = count - 1; i > -1; i--) {
			if(words[i].equals(s)) {
				returnIndex = i;
				return returnIndex;
			} else {
				returnIndex = -1;
			}
		}
		return returnIndex;
	}

	/*
		Returns the String at the given index.
		Returns null if index is out of range.
	*/
	public String get(int index) {
		//REPLACE WITH YOUR CODE
		if(index < count) {
			return words[index];
		} else {
			return null;

		}
	}


	/*
		Removes the item at the given index and returns it.
		Returns null if index is out of range.
	*/
	public String remove(int index) {

		if(index < count) {
			String temp = words[index];
			for(int i = index; i < count - 1; i++) {
				words[i] = words[i+1];
			}
			count--;
			return temp;		
		} else {
			return null;
		}
		
	}

	/*
		Removes the first occurance of the given item.
		Returns true if successful and false otherwise.
	*/
	public boolean remove(String s) {

		int findIndex = indexOf(s);
		
		if(findIndex != -1) {
			remove(findIndex);
			return true;
		} else {
			return false;
		}
		
	}

	/*
		Replaces the element at index with the given string. 
		Returns null if index is out of range.
		Returns the item replaced.
	*/	
	public String set(int index, String s) {

		String temp = words[index];
		if(index < count) {
			words[index] = s;
			return temp;
		} else {
			return null;

		}
	}


}
