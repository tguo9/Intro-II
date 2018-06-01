/**
	A class with several methods to manipulate jpg images.
	@author Tao Guo
**/
import java.util.Arrays;
import java.io.File;

public class ImageManipulator {
	
	//Load all files, get the file list, get the .jpg file's number and the get the file path. 
	public Picture[] getPictureFile(String directory) {

		File file1 = new File(directory);

		if (!file1.exists()) {
			System.out.println("Directory not found.");
			System.exit(1);
		}

		//the array for all files
		File[] files = (new File(directory)).listFiles();
		
		int count = 0;

		String[] path = new String[files.length];

		for(File file: files) {
			
			if(file.getName().endsWith(".jpg")) {
				path[count] = file.getAbsolutePath();
				count++;
			}

		}

		Picture[] pictures = new Picture[count];

		if(count == 0) {
			System.out.println("There is no jpg file in this directory");
			System.exit(1);
		}

		int count2 = 0;

		for(int i = 0; i < count; i++) {

			Picture picture = new Picture(path[i]);
			pictures[count2] = picture;
			count2++;

		}

		return pictures;
	}

	//For each picture, get each pixel, and add them to the array.
	public Pixel getRGBPixels(int width, int height, Picture[] pictures) {

		//get the length
		int length = pictures.length;

		int[] reds = new int[length];
		int[] greens = new int[length];
		int[] blues = new int[length];

		for(int i = 0; i < length; i++) {

			Pixel oldPixel = pictures[i].getPixel(width, height);
			reds[i] = oldPixel.getRed();
			greens[i] = oldPixel.getGreen();
			blues[i] = oldPixel.getBlue();

		}

		Arrays.sort(reds);
		Arrays.sort(greens);
		Arrays.sort(blues);

		Pixel newPixel = new Pixel();
		newPixel.setRed(reds[getMedian(reds)]);
		newPixel.setGreen(greens[getMedian(greens)]);
		newPixel.setBlue(blues[getMedian(blues)]);

		return newPixel;

	}


	//Get the median of the RGB values array.
	public int getMedian(int[] values) {

		int length = values.length;

		int median = 0;

		if(length % 2 != 0) {

			median = (((values.length) / 2) + (((values.length) / 2) - 1)) / 2;
		} else {

			median = (values.length) / 2;
		}

		return median;
	}


	//By calling the methods before, do the remove the photo from the directory.
	public void removePhotobomb(String directory, String outputfile) {

		Picture[] pictures = getPictureFile(directory);

		int width = pictures[0].getWidth();
		int height = pictures[0].getHeight();
		
		Picture newPicture = new Picture(width, height);


		for(int w = 0; w < width; w++) {
			for(int h = 0; h < height; h++) {

				newPicture.setPixel(w, h, getRGBPixels(w, h, pictures));

			}
		}

		newPicture.store(outputfile);

	}


	//Zoom the middle part of the picture, and the size of the picture saty the same.
	//Get help from TAs, tutors, and the professor.
	public void zoomMiddle(String inputfile, String outputfile) {

		Picture picture = new Picture(inputfile);
		int width = picture.getWidth();
		int height = picture.getHeight();

		Picture newPicture = new Picture(width, height);
		
		int startWidth = (int)(width * 0.25);
		int startHeight = (int)(height * 0.25);
		int endWidth = (int)(width * 0.75);
		int endHeight = (int)(height * 0.75);

		for(int w = startWidth; w < endWidth; w++) {

			int startW = w - startWidth;
			
			for(int h = startHeight; h < endHeight; h++) {
				
				Pixel oldPixel = picture.getPixel(w, h);

				Pixel newPixel = oldPixel;

				int startH = h - startHeight;

				if((startW * 2) + 1 < width && (startH * 2) + 1 < height) {

					newPicture.setPixel(startW * 2, startH * 2, newPixel);
					newPicture.setPixel((startW * 2) + 1, startH * 2, newPixel);
					newPicture.setPixel(startW * 2, (startH * 2) + 1, newPixel);
					newPicture.setPixel((startW * 2) + 1, (startH * 2) + 1, newPixel);
				
				} else {
					
					newPicture.setPixel(startW * 2, startH * 2, newPixel);
				}

			}
			
		}
		
		newPicture.store(outputfile);
		
	}

}