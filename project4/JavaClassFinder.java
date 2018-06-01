/**
	A class will recursively traverse the directory to find all Java files 
	in the specified directory or any descendant directory.
	@author Tao Guo
**/

import java.io.File;

public class JavaClassFinder {

	private JavaClassList javaNameList;

	//Get help from TA
	public JavaClassFinder(String path) {

		javaNameList = new JavaClassList();

		findFiles(path);
	}

	public void findFiles(String directory) {

		File input = new File(directory);

		if(input.isFile()) {
			if(input.getName().lastIndexOf(".java") != -1) {
				
				String takeSub = input.getName().substring(0, input.getName().indexOf("."));

				javaNameList.addJavaClass(new JavaClass(directory, takeSub));		
			} 
		} else if(input.isDirectory()) {	
			File[] children = input.listFiles();
			for(File f: children) {
				findFiles(f.getAbsolutePath());
			}
		}
	}

	//Get help from TA
	public JavaClassList returnList() {
		return javaNameList;
	}
}