package urok2.com.sap.edu.geekycamp.examples.virtualclasses;

public class CarStuff4 extends Car{
	@Override
	String getBrand() {
		return "Opel";
	}

	@Override
	String getType() {
		return "Astra";
	}

	@Override
	String getFuelType() {
		return "Gaseline";
	}

	@Override
	int getMaxSpeed() {
		// TODO Auto-generated method stub
		return 160;
	}

	@Override
	int getNumberOfSeats() {
		// TODO Auto-generated method stub
		return 5;
	}
}
