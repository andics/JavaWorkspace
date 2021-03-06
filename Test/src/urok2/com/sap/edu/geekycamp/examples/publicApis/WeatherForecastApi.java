package urok2.com.sap.edu.geekycamp.examples.publicApis;

/**
 * This is example interface for basic API usage. Create a subclass of this interface that will implement your implementation of a meteorological station. 
 *
 */
public interface WeatherForecastApi {
	public int whatWillBeTheTemperatureTomorow();
	public int whatWillBeTheTemperatureAfter (int days);
}
