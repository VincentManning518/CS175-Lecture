import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	// #4:
		
		double radius;
		
		System.out.print("Please input the radius of the circle: ");
		radius = in.nextDouble();
		System.out.println(" ");
		
		double area = Math.PI * radius * radius;
		double circ = Math.PI * 2 * radius;
		
		System.out.print("The area of the circle is: ");
		System.out.println(area);
		
		System.out.print("The cirucmference of the circle is: ");
		System.out.println(circ);
		
		
	// #5:
		
		double gas;
		double FuelEff, PPGal;
		
		System.out.print("Please input how many gallons of gas are in the tank: ");
		gas = in.nextInt();
		System.out.println(" ");
		
		System.out.print("Please input the fuel effeciency in miles per gallon: ");
		FuelEff = in.nextDouble();
		System.out.println(" ");
		
		System.out.print("Please input the price of gas per gallon: ");
		PPGal = in.nextDouble();
		System.out.println("");
		
		double TotCost = (100/FuelEff) * PPGal;
		double CurrentRange = gas * FuelEff;
		
		System.out.println("Your total cost per 100 miles is: " + TotCost + " Dollars");
		System.out.println("Your current range based on your current fuel level is: " + CurrentRange + " Miles");
		
	// #6:
		
		System.out.print("Please input a 5-digit, positive integer: ");
		int integer = in.nextInt();
		System.out.println(" ");
		
		int first = integer / 10000;
		int second = (integer / 1000) % 10;
		int third = (integer / 100) % 10;
		int fourth = (integer / 10) % 10;
		int fifth = integer % 10;
		
		System.out.println(first + "   " + second + "   " + third + "   " + fourth + "   " + fifth);
		
				
			
				
		
		
		
		
	}

}
