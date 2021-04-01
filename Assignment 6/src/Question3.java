import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name;
		System.out.print("Please input the name of the weaher station: ");
		name = in.nextLine();

		System.out.print("Would you like a weather reading? Input Y/N: ");
		String decision = in.next();
		boolean determinant;
		
		if (decision.contains("Y"))
		{
			determinant = true;
		}
		
		else if (decision.contains("N"))
		{
			System.out.println("Goodbye!");
			determinant = false;
		}
		
		else 
		{
			determinant = false;
			System.out.println("Invalid Response, Ending Session");
		}

				
		while (determinant == true)
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
			
			System.out.print("Would you like another reading? Input Y/N: ");
			String answer = in.next();
				if (answer.contains("Y"))
				{
					determinant = true;
				}
				
				else if (answer.contains("N"))
				{
					System.out.println("Goodbye!");
					determinant = false;
				}
				
				else 
				{
					System.out.println("Invalid Input, Ending Session");
					determinant = false;
				}
		}
		
	}

}
