
public class WeatherStation {

	double temp, windSpeed;
	String windDir;
	
	public WeatherStation()
	{
		temp = 0;
		windSpeed = 0;
		windDir = "";
	}
	
	public void tempSet(double userTemp)
	{
		temp = userTemp;
	}
	
	public void speedSet(double userSpeed)
	{
		windSpeed = userSpeed;
	}
	
	public void dirSet(String userDir)
	{
		windDir = userDir;
	}
	
	public double getTemp()
	{
		return temp;
	}
	public double getSpeed()
	{
		return windSpeed;
	}
	
	public String getDir()
	{
		return windDir;
	}
}
