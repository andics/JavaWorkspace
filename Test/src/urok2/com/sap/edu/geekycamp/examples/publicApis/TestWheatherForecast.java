package urok2.com.sap.edu.geekycamp.examples.publicApis;

public class TestWheatherForecast {
	public static void main(String[] args) throws Exception {
		// create instance of your meteorological station and test it using proovided method...
		WeatherForecastApi api = new Vremeto();
		testMyMeteorologicalStation(api);
		// TODO
		
	}
	
	private static void testMyMeteorologicalStation (WeatherForecastApi forecast) throws Exception {
		System.out.println("Forecast for tomofow is: " + forecast.whatWillBeTheTemperatureTomorow());
		for (int i = 0; i<10; i++){
			StringBuilder message = new StringBuilder("temperature forecast for ")
				.append(i)
				.append(" days ahead: ")
				.append(forecast.whatWillBeTheTemperatureAfter(i));
			System.out.println(message);
		}
		if (forecast.whatWillBeTheTemperatureAfter(1) != forecast.whatWillBeTheTemperatureTomorow()){
			throw new Exception ("gre6ka, utre i sled edin den triabva da e sy6tata temperatura");
		}
	}
}
