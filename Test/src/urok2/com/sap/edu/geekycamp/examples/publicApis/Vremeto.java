package urok2.com.sap.edu.geekycamp.examples.publicApis;

import java.util.Random;

public class Vremeto implements WeatherForecastApi{

	@Override
	public int whatWillBeTheTemperatureTomorow() {
		return whatWillBeTheTemperatureAfter(1);
	}

	@Override
	public int whatWillBeTheTemperatureAfter(int days) {
		 Random rn = new Random();
		 int range = 40 - 0 + 1;
		 int randomNum =  rn.nextInt(range) + 0;
		return randomNum;
	}

}
