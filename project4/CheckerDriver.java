public class CheckerDriver {
	
	public static void main(String[] args) {

		if(args.length != 1) {					
				System.out.println("usage: java JavaClassAnalyzer <absolute_path>");
				System.exit(1);				
		}

		String directory = args[0];

		Checker c = new Checker(directory);

		c.checkNumber();
	}
}