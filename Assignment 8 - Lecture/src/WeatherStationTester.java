import java.util.Scanner;
public class WeatherStationTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("Please input the Weather Station's name: ");
		String name = in.nextLine();
		
		System.out.print("Would you like a weather reading? Input Y/N: ");
		String determinant = in.next();
		
		while (determinant.contains("Y"))
		{
			WeatherStation station1 = new WeatherStation();
			
			System.out.print("Please input the temperature: ");
			double temp = in.nextDouble();
			
			System.out.print("Please input the wind speed: ");
			double speed = in.nextDouble();
			
			System.out.print("Please input the wind direction: ");
			String direction = in.next();
			
			station1.tempSet(temp);
			station1.speedSet(speed);
			station1.dirSet(direction);
			
			System.out.println(name + " Weather Station");
			System.out.println(station1.getTemp() + " degrees F");
			System.out.println(station1.getSpeed() + " MPH");
			System.out.println(station1.getDir());
			
			System.out.print("Would you like a weather reading? Input Y/N: ");
			determinant = in.next();
		}
	}

}
