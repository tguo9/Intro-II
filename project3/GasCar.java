/**
	A class for GasCar.
	@author Tao Guo
**/

public class GasCar extends Car{
	
	private int numberCylinders;
	private int mpg;

	public GasCar (String model, String vehicleClass, int pollutionScore, int numberCylinders, int mpg) {

		super(model, vehicleClass, pollutionScore);
		this.numberCylinders = numberCylinders;
		this.mpg = mpg;
	}

	public int getNumberCylinders() {
		return this.numberCylinders;
	}

	public int getMpg() {
		return this.mpg;
	}

	public String toString() {
		return super.toString() + 
				" MPG: " + mpg + " Cylinders: " + numberCylinders;
	}
}