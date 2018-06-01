/**
	A driver class to test the Car class.
	@author Tao Guo
**/

public class CarDBDriver {
	
	public static void main(String[] args) {

		BuildCarList builder = new BuildCarList();
		
		if(args.length != 1) {					
				System.out.println("usage: java CarDBDriver <filename>");
				System.exit(1);				
			}
		CarList list = builder.buildCarList(args[0]);

		if(list == null) {

			System.out.println("Error, the file was not found.");
			System.exit(0);
		}

		System.out.println("All Cars:");
		System.out.println(list.toString());

		System.out.println("Green Cars - Fuel Type: \n" + list.toStringGreenCars());

		System.out.printf("Average MPG All: %2.2f \n\n", list.avgMpg());
		System.out.printf("Average MPG Subaru: %2.2f \n\n", list.avgMpgByPartialModel("SUBARU"));
		System.out.printf("Average MPG Toyota: %2.2f \n\n", list.avgMpgByPartialModel("TOYOTA"));
		System.out.printf("Average MPG Ferrari: %2.2f \n\n", list.avgMpgByPartialModel("FERRARI"));

		System.out.print("Vehicle Classes with 4-Cylinder Cars: \n" + list.printString(list.findClassesByCylinders(4)));
		System.out.print("Vehicle Classes with 6-Cylinder Cars: \n" + list.printString(list.findClassesByCylinders(6)));
		
		System.out.print("Small SUVs with MPG > 22: \n" + list.printString(list.findModelsByClassAndMpg("Small SUV", 22)));
		System.out.print("Small Cars with MPG > 35: \n" + list.printString(list.findModelsByClassAndMpg("Small Car", 35)));

	}
}