import java.util.Scanner;
public class Lab4 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);

	// #1:
		
		System.out.print("Please input your income: ");
		double income = in.nextDouble();
		System.out.println(" ");
		
		if (income <= 50000 && income >= 0)
		{
			double tax = .01 * income;
			System.out.println("Your income tax would be: " + tax);
		}
		
		else if (income <= 75000 && income >= 0)
		{
			double tax = .02 * income;
			System.out.println("Your income tax would be: " + tax);
		}
		
		else if (income <= 100000 && income >= 0)
		{
			double tax = .03 * income;
			System.out.println("Your income tax would be: " + tax);
		}
		
		else if (income <= 250000 && income >= 0)
		{
			double tax = .04 * income;
			System.out.println("Your income tax would be: " + tax);
		}
		
		else if (income <= 500000 && income >= 0)
		{
			double tax = .05 * income;
			System.out.println("Your income tax would be: " + tax);
		}
		
		else if (income > 500000 )
		{
			double tax = .06 * income;
			System.out.println("Your income tax would be: " + tax);
		}
		
		else
		{
			System.out.println("Error");
		}
	

	// #2:
	int int1 , int2, int3;
	System.out.println("Please enter three integers: ");
	int1 = in.nextInt();
	int2 = in.nextInt();
	int3 = in.nextInt();
	
	if (int1 > int2 && int1 > int3)
	{
		System.out.println("The largest integer is: " + int1);
	}
	
	else if (int2 > int1 && int2 > int3)
	{
		System.out.println("The largest integer is: " + int2);
	}
	
	else if (int3 > int1 && int3 > int2)
	{
		System.out.println("The largest integer is: " + int3);
	}
	
	
	// #3:
	
	int first , second, third;
	System.out.println("Please enter three integers: ");
	first = in.nextInt();
	second = in.nextInt();
	third = in.nextInt();

	if (first > second && second > third && first > third)
	{
		System.out.println(third + "  " + second + "  " + first + "   in order");

}
	
	else if (third > second && third > first && second > first)
	{
		System.out.println(first + "  " + second + "  " + third + "   in order");

	}
	
	else
	{
		System.out.println(first + "  " + second + "  " + third + "   not in order");
	}
	
	
	//#4: 
	
	System.out.print("Please input your name: ");
	String name = in.next();
	
	System.out.print("Please input your salary: ");
	double salary = in.nextDouble();
	
	System.out.print("Please input how many hours you have worked over the past week: ");
	double hours = in.nextDouble();
	
	double wages = 0;
	if (hours > 40)
	{
		double overtime = hours - 40;
		hours = hours - overtime;
		wages = (overtime * (1.5 * salary)) + (hours * salary);
	}
	
	else if (hours <= 40)
	{
		wages = hours * salary;
	}
	
	System.out.println("Your wages for the week are: " + wages);
	
}	
	
}	
	
	

