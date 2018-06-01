/**
	A class will print certain shape.
	@author Tao Guo
**/

public class NumberPrinter {

	public static void printNums(int n) {
		printNums(0, n);
	}

	private static void printNums(int start, int end) {
		
		if(end == start) {
			System.out.println(start);
			return;
		} 

		if (start < end){
			System.out.print(start);
			printNums(start + 1,end);
		}
	}

	private static void printRows(int start, int end){
		
		if (start == end) {
			printNums(end);
		}
		
		if (start != end) {
			printNums(start);
			printRows(start + 1,end);
			printNums(start);
		}
	}

    public static void main(String[] args) {
        
    	if(args.length != 1) {					
				System.out.println("usage: java NumberPrinter <int>");
				System.exit(1);				
		}

		String temp = args[0];
		
		try {
			int number = Integer.parseInt(temp);
			printRows(0, number);
		} catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
		}

    }
}