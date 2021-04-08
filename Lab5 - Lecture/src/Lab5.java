import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// #1: Reads a Sequence of integers
		// a: Prints out largest and smallest integers
		
		System.out.println("Please input a sequence of integers, enter 'q' to stop: ");
		int i = in.nextInt();
		int large = i;
		int small = i;
		while (in.hasNextInt())
		{
			i = in.nextInt();
			if (i > large)
			{
				large = i;
			}
			
			else if (i < small)
			{
				small = i;
			}
		}
		
		System.out.println("The largest digit is: " + large);
		System.out.println("The smallest digit is: " + small);
		
		// b:

		Scanner odd = new Scanner(System.in);
		
		System.out.println("Please input a sequence of integers, press 'q' to stop: ");
		int counterEven = 0;
		int counterOdd = 0;
		int l = 0;
		while (odd.hasNextInt())
		{
			l = odd.nextInt();
			if (l % 2 == 0)
			{
				counterEven++;
			}
			
			else if (l % 2 == 1)
			{
				counterOdd++;
			}	
		}
		
		System.out.println("There are " + counterEven + " even numbers in the sequence");
		System.out.println("There are " + counterOdd + " odd numbers in the sequence");
		
		// c:
		
		Scanner sum = new Scanner(System.in);
		
		System.out.println("Please input a sequence of integers, press 'q' to stop");
		int n = 0;
		int m = 0;
		String end = "";
		
		while (sum.hasNextInt())
		{
			n = sum.nextInt();
			int add = n + m;
			m = add;
			end += add + " ";
		}
		
		System.out.println(end);
		
		// d:
		
		Scanner adj = new Scanner(System.in);
				
		System.out.println("Please input a sequence of integers, press 'q' to end: ");
		int p = 0;
		int q = -1;
		String result = "";
		
		while (adj.hasNextInt())
		{
			p = adj.nextInt();
			if (p == q)
			{
				result += p;
			}
			else
			{
				
			}
			q = p;
		}
		
		System.out.println(result);
	}

}
