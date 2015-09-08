package urok2.com.sap.edu.geekycamp.examples.virtualclasses;

public class CarStuff extends Car{
	@Override
	public void printCarParameters() {
		StringBuilder carParameters = new StringBuilder();
		carParameters.append("brand:")
			.append(getBrand())
			.append(", type:")
			.append(getType())
			.append("color: ")
			.append(getColor())
			.append(", fuel:")
			.append(getFuelType())
			.append(", max speed:")
			.append(getMaxSpeed())
			.append(", driveleft:")
			.append(drive(300))
			.append(", seats:")
			.append(getNumberOfSeats());
		System.out.println(carParameters);
	}
	@Override
	String getBrand() {
		return "Audi";
	}
	
	String getColor() {
	return "Black";
	}

	@Override
	String getType() {
		return "A8";
	}

	@Override
	String getFuelType() {
return "Hybrid";
	}

	@Override
	int getMaxSpeed() {
		// TODO Auto-generated method stub
		return 250;
	}

	@Override
	int getNumberOfSeats() {
		// TODO Auto-generated method stub
		return 5;
	}

}
