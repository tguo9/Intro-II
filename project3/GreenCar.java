/**
	A class for GreenCar.
	@author Tao Guo
**/

public class GreenCar extends Car{
	
	private String fuelType;

	public GreenCar (String model, String vehicleClass, int pollutionScore, String fuelType) {

		super(model, vehicleClass, pollutionScore);
		this.fuelType = fuelType;
	}

	public String getFuelType() {
		return this.fuelType;
	}

	public String toString() {
		return super.toString() + 
				" Type: " + fuelType;
	}
}