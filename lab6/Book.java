/**
	A class that represents books.
	@author Tao Guo
**/

public class Book extends Publication {

	private boolean softCover;

	public Book(String title, int numOfPages, boolean softCover) {
		super(title, numOfPages);
		this.softCover = softCover;
	}

	public boolean getSoftCover() {
		return this.softCover;
	}

	public String toString() {

		String parentString = super.toString();
		return parentString + "Soft cover : " + softCover + "\n";
	}

}