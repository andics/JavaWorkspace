package urok2.com.sap.edu.geekycamp.examples.virtualclasses;

public class CarStuff3 extends Car{
	@Override
	String getBrand() {
		return "Lamborgini";
	}

	@Override
	String getType() {
		return "Aventador";
	}

	@Override
	String getFuelType() {
		return "Gaseline";
	}

	@Override
	int getMaxSpeed() {
		// TODO Auto-generated method stub
		return 400;
	}

	@Override
	int getNumberOfSeats() {
		// TODO Auto-generated method stub
		return 5;
	}
}
