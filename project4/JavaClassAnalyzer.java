/**
	A driver for all other files.
	@author Tao Guo
**/

public class JavaClassAnalyzer {

	public static void main(String[] args) {

		if(args.length != 1) {					
				System.out.println("usage: java JavaClassAnalyzer <absolute_path>");
				System.exit(1);				
		}

		String directory = args[0];
		
		JavaClassFinder finder = new JavaClassFinder(directory);

		finder.returnList().getSortList();

		System.out.print(finder.returnList().toString());
		
	}
}