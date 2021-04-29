import java.util.Scanner;
public class TemperatureScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner temp = new Scanner(System.in);

		int counter = 0;
		double temperature, highestTemp = -999999, lowestTemp = 999999, total = 0;
		
		System.out.println("Please input 12 temperatures: ");
		while (counter < 12)
		{
			temperature = temp.nextDouble();
			if (temperature >= highestTemp)
			{
				highestTemp = temperature;
			}
			
			if (temperature <= lowestTemp)
			{
				lowestTemp = temperature;
			}
			total = total + temperature;
			counter++;
		}
		
		double averageTemp = total / 12;
		System.out.println("The highest temperature is: " + highestTemp + " degress");
		System.out.println("The lowest temperature is: " + lowestTemp + " degress");
		System.out.printf("The average temperature is: %.2f", averageTemp);
		System.out.println(" degrees");
	}

}
