/**
	A class that will construct a Car object from
	a given CSV file.
	@author Tao Guo
**/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BuildCarList {
	
	public CarList buildCarList(String filename) {

		CarList cars = new CarList();

		File inputFile = new File(filename);

		try(Scanner input = new Scanner(inputFile)) {
			input.useDelimiter(",|\n");

			input.nextLine();

			while(input.hasNext()) {

				String model = input.next();
				input.next();
				
				String temCylinders = input.next();
				int numberCylinders = -1;
				if(!temCylinders.equals("N/A")) {
					numberCylinders = Integer.parseInt(temCylinders);
				}
				
				input.next();
				input.next();
				
				String temType = input.next();
				String type = null;
				if(!temType.contains("Gas") && !temType.contains("Diesel") && !temType.contains("Ethanol")) {
					type = temType;
				}

				input.next();
				input.next();
				input.next();
				input.next();
				String vehicleClass = input.next();
				int pollutionScore = input.nextInt();
				input.next();
				input.next();
				
				String temMpg = input.next();
				int mpg = -1;
				if(temMpg.contains("/")) {
					String[] temParts = temMpg.split("/");
					mpg = Integer.parseInt(temParts[0]);
				} else {
					mpg = Integer.parseInt(temMpg);
				}

				input.next();
				input.next();
				input.next();

				if(type != null) {

					Car newCar = new GreenCar(model, vehicleClass, pollutionScore, type);
					cars.addCar(newCar);
				} else if(mpg != -1){
					Car newCar = new GasCar(model, vehicleClass, pollutionScore, numberCylinders, mpg);
					cars.addCar(newCar);

				}
			}


		} catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
			return null;
		}
		
		return cars;
	}
}