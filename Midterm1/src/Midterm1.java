import java.util.Scanner;
public class Midterm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		// #1:
		
		System.out.print("Please enter an integer between 1 and 12: ");
		int input = in.nextInt();
		System.out.println(" ");
		
		if (input == 1 || input == 2 || input == 3)
		{
			System.out.println("It is Winter");
		}	
		
		else if (input == 4 || input == 5 || input == 6)
		{
			System.out.println("It is Spring");
		}	
	
		else if (input == 7 || input == 8 || input == 9)
		{
			System.out.println("It is Summer");
		}	
		
		else if (input == 10 || input == 11 || input == 12)
		{
			System.out.println("It is Fall");
		}	
		
		else
		{
			System.out.println("It is an invalid month.");
		}
		
		// #2: 
		
		System.out.print("Please enter the cost of your groceries: ");
		double cost = in.nextDouble();
		double coupon;
		
		if (cost < 10)
		{
			System.out.println("You win a discount coupon of $0.00");
		}
		
		else if (cost < 60)
		{
			coupon = .08 * cost;
			System.out.printf("You win a discount coupon of $%.2f", coupon);
		}
		
		else if (cost < 150)
		{
			coupon = .1 * cost;
			System.out.printf("You win a discount coupon of $%.2f", coupon);
		}
		
		else if (cost <= 210)
		{
			coupon = .12 * cost;
			System.out.printf("You win a discount coupon of $%.2f", coupon);
		}
		
		else if (cost > 210)
		{
			coupon = .14 * cost;
			System.out.printf("You win a discount coupon of $%.2f", coupon);
		}
		
		
	}

}
