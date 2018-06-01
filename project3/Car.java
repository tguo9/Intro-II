/**
	A class for Car.
	@author Tao Guo
**/

public abstract class Car implements Comparable<Car> {
	
	protected String model;
	protected String vehicleClass;
	protected int pollutionScore;

	public Car (String model, String vehicleClass, int pollutionScore) {
		this.model = model;
		this.vehicleClass = vehicleClass;
		this.pollutionScore = pollutionScore;

	}

	public String getModel() {
		return this.model;
	}

	public String getVehicleClass() {
		return this.vehicleClass;
	}

	public int getPollutionScore() {
		return this.pollutionScore;
	}

	public String toString() {
		return "Model: " + model + " Class: " + vehicleClass + " Pollution Score: " + pollutionScore;
	}

	public int compareTo(Car other) {

		int pollutionResult = this.pollutionScore - other.getPollutionScore();

		if(pollutionResult == 0) {
			int modelResult = this.model.compareTo(other.getModel());
			return modelResult;
		} else {
			return pollutionResult;
		}
	}
	
}