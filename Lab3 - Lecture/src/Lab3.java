import java.util.Scanner;
public class Lab3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
	// #1:
	
		System.out.print("please input a word: ");
		String input = in.next();
		System.out.println(" ");
		
		char first;
		int n = input.length();
		first = input.charAt(0);
		String middle = input.substring(1, n - 1);
		String last =input.substring(n-1);
		
		System.out.println(first + "   " + last + "   " + middle);
		
	// #2:
		
		String number;
		
		System.out.print("PLease input an integer between 1,000 and 999,999: ");
		number = in.next();
		System.out.println(" ");
		
		System.out.print("The number without a comma is: ");
		int m = number.length();
		String start = number.substring(0, m-4);
		String end = number.substring(m-3, m);
		System.out.println(start + end);
		
		
	// #3:
		
		double currentFuel, totalFuel;
		
		System.out.print("Please input the amount of fuel remaining: ");
		currentFuel = in.nextDouble();
		System.out.println(" ");
		System.out.print("Please input the total size of the fuel tank: ");
		totalFuel = in.nextDouble();
		System.out.println(" ");
		
		double percent = currentFuel / totalFuel;
		
		if (percent < .10)
		{
			System.out.println("Red");
		}
		else 
		{
			System.out.println("Green");
		}
		
	// #4:
		
 		System.out.print("Please input your integer grade: ");
		
		int grade = in.nextInt();
		System.out.println(" ");
		
		if (grade >= 90)
		{
			System.out.println("A");
		}
		else if (grade >= 80)
		{
			System.out.println("B");
		}
		else if (grade >=70)
		{
			System.out.println("C");
		}
		else if (grade >= 60)
		{
			System.out.println("D");
		}
		else 
		{
			System.out.println("F");
		}
	}
	

}
