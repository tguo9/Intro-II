/**
	A class that represents magazines.
	@author Tao Guo
**/

public class Magazine extends Publication {
	
	private int numberOfSubscribers;

	public Magazine(String title, int numOfPages, int numberOfSubscribers) {
		super(title, numOfPages);
		this.numberOfSubscribers = numberOfSubscribers;
	}

	public int numberOfSubscribers() {
		return this.numberOfSubscribers;
	}

	public String toString() {

		String parentString = super.toString();
		return parentString + "Number Of Subscribers : " + numberOfSubscribers + "\n";
	}
}