/**
	A class count of the number of files found with different extensions.
	@author Tao Guo
**/

import java.io.File;
import java.util.HashMap;

public class FileFinder {

	public static HashMap<String, Integer> findFiles(String directory) {

		HashMap<String, Integer> result = new HashMap<String, Integer>();

		findFiles(new File(directory), result);
		return result;

	}

	private static void findFiles(File input, HashMap<String, Integer> result) {

		if(input.isAbsolute() == false) {
			System.out.println("It is not a absolute path.");
			System.exit(1);	
		}

		if(input.isFile()) {
			
			if(input.getName().lastIndexOf(".") != -1) {
				String takeSub = input.getName().substring(input.getName().lastIndexOf("."));

					if(!result.containsKey(takeSub)) {
						result.put(takeSub, 1);
					} else {
						result.put(takeSub, result.get(takeSub)+1);
					}			
			} 	
		} else if(input.isDirectory()) {	
			File[] children = input.listFiles();
			for(File f: children) {
				findFiles(f, result);
			}
		}
	}

	public static void main(String[] args) {

		if(args.length != 1) {					
				System.out.println("usage: java FileFinder <absolute_path>");
				System.exit(1);				
		}

		String directory = args[0];

		HashMap<String, Integer> result = findFiles(directory);

		for(String key: result.keySet()) {
			System.out.println(key + "\n\t" + result.get(key));
		}
	}
	
}