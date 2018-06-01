/**
	This is a class hold the Car in Array.
	@author Tao Guo
**/

import java.util.*;

public class CarList {
	
	private Car[] cars;
	private Car[] greenCars;
	private Car[] gasCars;
	private int count;
	private int countGreen;
	private double totalMpg;

	public CarList () {
		count = 0;
		countGreen = 0;
		cars = new Car[100];
		greenCars = new Car[10];
		totalMpg = 0;
	}

	public void addCar(Car newCar) {

		if(count == cars.length) {
			resize();
		} 
			
		if(count == 0) {
			cars[count] = newCar;
			count++;
			return;
		}	
		/*
		Thanks a lot for Prof. Rollins,
		Also Alec help at last second.
		I really cry when I wrote this part.
		*/
		//TODO
		int index = 0;

		for(int i = count-1; i > -1; i--){
			if(cars[i].compareTo(newCar) >= 0){
				cars[i+1] = cars[i];
			} else {
				index = i+1;
				break;
			}
		}
		cars[index] = newCar;
		count++;		
	}

	private void resize() {

		Car[] tmpCars = new Car[cars.length*2];

		for(int i = 0; i < cars.length; i++) {
			tmpCars[i] = cars[i];
		}

		cars = tmpCars;

	}

	public Car[] getGreenCars() {

		for(Car c: cars) {
			if(c instanceof GreenCar) {
				greenCars[countGreen] = c;
				countGreen++;
				if(countGreen == greenCars.length) {
			
					Car[] tmpCars = new Car[greenCars.length*2];
			
					for(int i = 0; i < greenCars.length; i++) {
						tmpCars[i] = greenCars[i];
					}

					greenCars = tmpCars;
				}

			}
		}

		return greenCars;
	}

	public String toString() {
		
		String returnVal = "";

		for(Car c: cars) {

			if(c != null) {
				returnVal += c.toString() + "\n";
			}
		}

		return returnVal;
	}

	public String toStringGreenCars() {
		
		String returnVal = "";

		greenCars = getGreenCars();

		for(Car g: greenCars) {

			if(g != null && g instanceof GreenCar) {
				GreenCar gc = (GreenCar)g;
				returnVal += "Model: " + gc.getModel() + " Type: " + gc.getFuelType() + "\n";
			}
		}

		return returnVal;
	}

	public double avgMpg() {

		for(Car g: cars) {

			if(g instanceof GasCar) {	
				GasCar s = (GasCar)g;			
				totalMpg += s.getMpg();
			}
		}

		double result = (totalMpg) / (count - countGreen);

		return result;
	}

	public double avgMpgByPartialModel(String model) {
		
		int totalCount = 0;
		double totalMpgByPartialModel = 0;

		for(Car c: cars) {

			if(c != null) {
				if(c.getModel().contains(model) && c instanceof GasCar) { //&& c instanceof GasCar
				GasCar g = (GasCar)c;
				totalMpgByPartialModel += g.getMpg();
				totalCount++;

				}
			}
		}

		double result = (totalMpgByPartialModel) / totalCount;

		return result;
	}

	public String[] findClassesByCylinders(int cylinders) {
		
		String[] carClass = new String[count];
		int countClass = 0;

		for(Car cy: cars) {
			if(cy instanceof GasCar) {
				GasCar y = (GasCar)cy;
				if(cylinders == y.getNumberCylinders()) {
					carClass[countClass] = y.getVehicleClass();
					countClass++;
				}
			}
		}

		String[] temp = new String[countClass];
		for(int i = 0; i < countClass; i++) {
			temp[i] = carClass[i];
		}

		Arrays.sort(temp);

		int i = 0;
		int j = 1;

		while(j < countClass) {
			if(temp[i].equals(temp[j])) {
				j++;
			} else {
				i++;
				temp[i] = temp[j];
				j++;
			}
		}

		String[] carClassLast = new String[i+1];
		for(int a = 0; a < i+1; a++) {
			carClassLast[a] = temp[a];
		}

		Arrays.sort(carClassLast);

		return carClassLast;
	}
	
	public String[] findModelsByClassAndMpg(String vehicleClass, int minMPG) {

		String[] carModel = new String[count];
		int countModel = 0;

		for(Car cm: cars) {
			if(cm instanceof GasCar) {
				GasCar m = (GasCar)cm;
					if(m.getVehicleClass().toLowerCase().contains(vehicleClass.toLowerCase()) && m.getMpg() >= minMPG) {
					carModel[countModel] = cm.getModel();
					countModel++;
				}
			}
		}

		String[] temp = new String[countModel];
		for(int i = 0; i < countModel; i++) {
			temp[i] = carModel[i];
		}
		
		Arrays.sort(temp);

		return temp;
	}

	public String printString(String[] intputString) {
		
		String returnVal = "";

		for(int s = 0; s < intputString.length; s++) {

			if(intputString[s] != null) {
					returnVal += "\t" + intputString[s] + "\n";
			}
		}

		return returnVal;
	}
}

	