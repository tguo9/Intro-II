/**
	A class that represents publication.
	@author Tao Guo
**/

public abstract class Publication implements Comparable<Publication> {
	
	protected String title;
	protected int numOfPages;

	public Publication(String title, int numOfPages) {

		this.title = title;
		this.numOfPages = numOfPages;
	}

	public String getTitle() {
		return this.title;
	}

	public int getNumOfPages() {
		return this.numOfPages;
	}

	public String toString() {
		return "Title: " + title + "\n" + "Number of pages: " + numOfPages + "\n";
	}

	public int compareTo(Publication other) {
		
		int result = this.numOfPages - other.getNumOfPages();

			return result;
		
	}
}