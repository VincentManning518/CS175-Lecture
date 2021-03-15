import java.util.Scanner;
public class NEWweatherStation {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String name, decision;

		System.out.print("What is the name of the weather station?: ");
		name = in.nextLine();
		
		System.out.print("Would you like to input a weather reading? Y/N: ");
		decision = in.next();
		
		if (decision.equals("Y"))
		{
			double temp;
			int windspeed;
			String windDir;
			
			System.out.print("Please input the current temperature: ");
			temp = in.nextDouble();
			System.out.println(" ");
			
			System.out.print("Please inpute the current wind speed: ");
			windspeed = in.nextInt();
			System.out.println(" ");
			
			System.out.print("Please input the current wind direction: ");
			windDir = in.next();
			System.out.println(" ");
			
			System.out.println("The " + name + " Weather Station");
			System.out.println("Temperature: " + temp);
			System.out.println("Wind: " + windspeed + " mph " + windDir);
		}
		else
		{
			System.out.print("Goodbye!");
		}
		
	}

}
