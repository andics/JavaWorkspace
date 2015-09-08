package urok2.com.sap.edu.geekycamp.examples.virtualclasses;

public class CarStuff2 extends Car{
	@Override
	String getBrand() {
		return "Ford";
	}

	@Override
	String getType() {
		return "Mustang";
	}

	@Override
	String getFuelType() {
return "Gaseline";
	}

	@Override
	int getMaxSpeed() {
		// TODO Auto-generated method stub
		return 300;
	}

	@Override
	int getNumberOfSeats() {
		// TODO Auto-generated method stub
		return 5;
	}
}
