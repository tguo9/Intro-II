import java.io.File;
import java.io.FileNotFoundException;

public class SquaresDriver {

	public static void main(String[] args) {
		
		ImageSquares im = new ImageSquares();

		//im.getNineParts("nophotobomb.jpg");

		im.eightSquares("nophotobomb.jpg", "random.jpg");


	}

}