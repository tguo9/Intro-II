/**
	A Driver for other classes.
	@author Tao Guo
**/

import java.io.File;
import java.io.FileNotFoundException;

public class ImageDriver {

	public static void main(String[] args) {
		
		ImageManipulator im = new ImageManipulator();

		if(args.length != 1) {					
				System.out.println("Please enter a name of a directory.");
				System.exit(1);				
			}

		im.removePhotobomb(args[0], "nophotobomb.jpg");

		im.zoomMiddle("nophotobomb.jpg", "zoomed.jpg");


	}

}