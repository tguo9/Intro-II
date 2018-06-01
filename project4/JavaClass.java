/**
	A class crate JavaClass object.
	@author Tao Guo
**/

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class JavaClass implements Comparable<JavaClass> {

	private int countLine;
	private int countComment;
	private String path;
	private String name;
	private boolean inComment;
	private boolean isValid;

	public JavaClass(String path, String name) {

		this.path = path;
		this.name = name;

		File inputFile = new File(path);

		try(Scanner input = new Scanner(inputFile)) {
			input.useDelimiter("\n");

			boolean inComment = false;

			while(input.hasNext()) {
				countLine++;

				String stringLine = input.nextLine().trim();

				if(stringLine.startsWith("//")) {
					countComment++;
				} 

				if(stringLine.startsWith("/*") && inComment == false) {
					inComment = true;
					countComment++;
				} 

				if(inComment == true && !stringLine.endsWith("*/")) {
					countComment++;
				} 

				if(inComment == true && stringLine.endsWith("*/")) {
					inComment = false;
					countComment++;
				}

				if(stringLine.indexOf("class ") != -1 && inComment == false && isValid == false) {
					
					String[] classLine = stringLine.split(" ");

					int nameIndex = 0;

					for(int i = 0; i < classLine.length; i++) {

						if(classLine[i].equals("class")) {
							nameIndex = i + 1;
							break;
						}
					}
					
					String className = classLine[nameIndex];
					
					if(className.equals(name)) {
						isValid = true;
					}
				}
			}
		} catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
		}

		this.isValid = isValid;
	}

	public String getPath() {
		return this.path;
	}

	public String getName() {
		return this.name;
	}
	public boolean getValid() {
		return this.isValid;
	}

	public int getCountLine() {
		return this.countLine;
	}

	public int getComment() {
		return this.countComment;
	}

	//Sort the list base on this compareTo
	public int compareTo(JavaClass other) {
		
		int lastResult = this.countLine - (other.getCountLine());

		return lastResult;
	}
}