import java.util.Arrays;
import java.io.File;
import java.util.Random;


public class ImageSquares {

	public int getRandomIndex(int index) {

		Random r1 = new Random();

		int randomIndex = r1.nextInt(index);
		
		return randomIndex;
	}

	public Picture[] getNineParts(String inputfile) {

		Picture[] pictures = new Picture[9];

		Picture picture = new Picture(inputfile);

		int partW = 3;
		int partH = 3;

		int partWidth = picture.getWidth() / partW;
		int partHeight = picture.getHeight() / partH;

		// int[] indexWidth = new int[3];
		// int[] indexHeight = new int[3];

		// indexWidth = {0, partWidth, partWidth * 2};
		// indexHeight = {0, partHeight, partHeight * 2};

		Picture newPicture1 = new Picture(partWidth, partHeight);
		Picture newPicture2 = new Picture(partWidth, partHeight);
		Picture newPicture3 = new Picture(partWidth, partHeight);
		Picture newPicture4 = new Picture(partWidth, partHeight);
		Picture newPicture5 = new Picture(partWidth, partHeight);
		Picture newPicture6 = new Picture(partWidth, partHeight);
		Picture newPicture7 = new Picture(partWidth, partHeight);
		Picture newPicture8 = new Picture(partWidth, partHeight);
		Picture newPicture9 = new Picture(partWidth, partHeight);

		for(int w = 0; w < partWidth; w++) {
			for(int h = 0; h < partHeight; h++) {

				Pixel partPixel1 = picture.getPixel(w, h);
				Pixel partPixel2 = picture.getPixel(w + partWidth, h);
				Pixel partPixel3 = picture.getPixel(w, h + partHeight);
				Pixel partPixel4 = picture.getPixel(w + partWidth * 2, h);
				Pixel partPixel5 = picture.getPixel(w, h + partHeight * 2);
				Pixel partPixel6 = picture.getPixel(w + partWidth, h + partHeight);
				Pixel partPixel7 = picture.getPixel(w + partWidth, h + partHeight * 2);
				Pixel partPixel8 = picture.getPixel(w + partWidth * 2, h + partHeight);
				Pixel partPixel9 = picture.getPixel(w + partWidth * 2, h + partHeight * 2);

				newPicture1.setPixel(w, h, partPixel1);
				newPicture2.setPixel(w, h, partPixel2);
				newPicture3.setPixel(w, h, partPixel3);
				newPicture4.setPixel(w, h, partPixel4);
				newPicture5.setPixel(w, h, partPixel5);
				newPicture6.setPixel(w, h, partPixel6);
				newPicture7.setPixel(w, h, partPixel7);
				newPicture8.setPixel(w, h, partPixel8);
				newPicture9.setPixel(w, h, partPixel9);
				
				pictures[0] = newPicture1;
				pictures[1] = newPicture2;
				pictures[2] = newPicture3;
				pictures[3] = newPicture4;
				pictures[4] = newPicture5;
				pictures[5] = newPicture6;
				pictures[6] = newPicture7;
				pictures[7] = newPicture8;
				pictures[8] = newPicture9;

			}
		}


		return pictures;
	}
	
	public void eightSquares(String inputfile, String outputfile) {

		Picture picture = new Picture(inputfile);

		int partW = 3;
		int partH = 3;

		int width = picture.getWidth();
		int height = picture.getHeight();

		int partWidth = width / partW;
		int partHeight = height / partH;

		int[] indexWidth = new int[3];
		int[] indexHeight = new int[3];

		indexWidth[0] = 0;
		indexWidth[1] = partWidth;
		indexWidth[2] = partWidth * 2;

		indexHeight[0] = 0;
		indexHeight[1] = partHeight;
		indexHeight[2] = partHeight * 2;

		Picture[] pictures = getNineParts(inputfile);
		Picture newPicture = new Picture(width, height);

		int randomWidth1 = getRandomIndex(3);
		int randomHeight1 = getRandomIndex(3);
		int randomWidth2 = getRandomIndex(3);
		int randomHeight2 = getRandomIndex(3);
		int randomWidth3 = getRandomIndex(3);
		int randomHeight3 = getRandomIndex(3);
		int randomWidth4 = getRandomIndex(3);
		int randomHeight4 = getRandomIndex(3);
		int randomWidth5 = getRandomIndex(3);
		int randomHeight5 = getRandomIndex(3);
		int randomWidth6 = getRandomIndex(3);
		int randomHeight6 = getRandomIndex(3);
		int randomWidth7 = getRandomIndex(3);
		int randomHeight7 = getRandomIndex(3);
		int randomWidth8 = getRandomIndex(3);
		int randomHeight8 = getRandomIndex(3);

			for(int w = 0; w < partWidth; w++) {
				for(int h = 0; h < partHeight; h++) {

					Pixel allPixel1 = pictures[0].getPixel(w, h);
					Pixel allPixel2 = pictures[1].getPixel(w, h);
					Pixel allPixel3 = pictures[2].getPixel(w, h);
					Pixel allPixel4 = pictures[3].getPixel(w, h);
					Pixel allPixel5 = pictures[4].getPixel(w, h);
					Pixel allPixel6 = pictures[5].getPixel(w, h);
					Pixel allPixel7 = pictures[6].getPixel(w, h);
					Pixel allPixel8 = pictures[7].getPixel(w, h);
					Pixel allPixel9 = pictures[8].getPixel(w, h);

					newPicture.setPixel(w + randomWidth1, h + randomHeight1, allPixel1);
					newPicture.setPixel(w + randomWidth2, h + randomHeight2, allPixel2);
					newPicture.setPixel(w + randomWidth3, h + randomHeight3, allPixel3);
					newPicture.setPixel(w + randomWidth4, h + randomHeight4, allPixel4);
					newPicture.setPixel(w + randomWidth5, h + randomHeight5, allPixel5);
					newPicture.setPixel(w + randomWidth6, h + randomHeight6, allPixel6);
					newPicture.setPixel(w + randomWidth7, h + randomHeight7, allPixel7);
					newPicture.setPixel(w + randomWidth8, h + randomHeight8, allPixel9);
					//newPicture.setPixel(w + partWidth * 2, h + partHeight * 2, allPixel8);

				}
			}
		

		newPicture.store(outputfile);

		//}
	}

}

// }