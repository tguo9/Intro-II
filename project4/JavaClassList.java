/**
	A class put JavaClass object into a arraylist.
	@author Tao Guo
**/

import java.util.ArrayList;
import java.util.Collections;

public class JavaClassList {

	private ArrayList<JavaClass> javaClass;
	private int totalLine;
	private int totalValid;

	//Get help from TA
	public JavaClassList () {
		this.javaClass = new ArrayList<JavaClass>();
	}

	public void addJavaClass(JavaClass javaClass) {
		this.javaClass.add(javaClass);
	}
	
	public String toString() {

		String returnVal = "";
		int totalLine = 0;
		int totalComment = 0;

		returnVal = "Valid Classes - Total: " + allValid() + "\n"; 
				
		for(JavaClass p: javaClass) {

			if(p.getValid() == true) {
				
				returnVal += "Class: " + p.getName() + " [" + p.getPath() + "]\n";
				returnVal += "\tSLOC: " + p.getCountLine() + "\n";
				returnVal += "\tSLOC (excluding comments): " + (p.getCountLine() - p.getComment()) + "\n";

				totalComment += p.getComment();
				totalLine += p.getCountLine();

			}
			
		}

		returnVal += "Total SLOC: " + totalLine + "\n";
		returnVal += "Total SLOC (excluding comments): " + (totalLine - totalComment) + "\n";

		returnVal += "Invalid Classes:\n";

		for(JavaClass p: javaClass) {

			if(p.getValid() == false) {

				returnVal += p.getPath() + "\n";
			}
		} 

		return returnVal;
				
	}

	public int allValid() {

		int totalValid = 0;

		for(JavaClass j: javaClass) {

			if(j.getValid() == true) {
				totalValid++;
			}
		}

		return totalValid;
	}

	//Get help from TA
	public void getSortList() {
		Collections.sort(javaClass);
	}
	
}