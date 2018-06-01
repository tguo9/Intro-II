import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class Checker {
	
	private String path;
	//private String name;
	private boolean isValid;
	private int countLeft;
	private int countRight;
	private ArrayList<String> convertToNumber;

	public Checker(String path) {

		this.path = path;
		//this.name = name;

		File inputFile = new File(path);

		try(Scanner input = new Scanner(inputFile)) {
			input.useDelimiter("\n");

			boolean inComment = false;

			while(input.hasNext()) {

				String stringLine = input.nextLine().trim();

				if(stringLine.startsWith("/*") && inComment == false) {
					inComment = true;
				} 

				if(inComment == true && stringLine.endsWith("*/")) {
					inComment = false;
				}

				if(!stringLine.startsWith("//") && inComment == false) {
					
					String[] classLine = stringLine.split(" ");

					for(int i = 0; i < classLine.length; i++) {

						if(classLine[i].equals("{")) {
							countLeft++;
							//convertToNumber.add("0");
						}

						if(classLine[i].equals("}")) {
							countRight++;
							//convertToNumber.add("1");
						}
					}
				}
			}
		} catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
		}

		this.isValid = isValid;
	}

	public void checkNumber() {

		if(countRight != countLeft) {
			isValid = false;
		} else {
			isValid = true;
		}
/**
	To be continued.
	Basic logic:
	If "{", add 0 to list,
	If "}", add 1 to list.
	Then using 0 and 1 to check if they are vaild.
**/
		// else {
		// 	for(String i: convertToNumber) {
		// 		if(i != null) {
		// 			System.out.println(i);	
		// 		}
		// 	}	
		// }
	}
}