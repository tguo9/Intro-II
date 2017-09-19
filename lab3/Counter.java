/**
	A class that represents a simple tally counter.
	@author Tao Guo
**/

public class Counter {

	//A data member.
	private int count;

	//Set the initial count number.
	public Counter() {
		count = 0;
	}

	//The click methods.
	public void click() {
		count++;
	}

	//The getCount methods.
	public int getCount() {
		return count;
	}

	//Reset the methods.
	public void reset() {
		count = 0;
	}

	//This methods is to print out the number.
	public String toString(){
		return "Count = " + count;
	}
}