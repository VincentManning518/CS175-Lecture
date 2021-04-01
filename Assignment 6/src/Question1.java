import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// A:
		
		int p, s = 0;
		for (p = 1; p <= 50; p++)
		{
			int q = 2 * p;
			s = s + q;
		}
		
		System.out.println("The sum of all even numbers between 2 and 100 is: " + s);
		
		
		// B:
		
		int n;
		System.out.print("Please input an integer: ");
		n = in.nextInt();
		int div = n / 10;
		
		for (div = (div * (1/div)) + 1; div * 10 < n; div++)
		{
			int prod = div * 10;
			System.out.print(prod + "  ");
		}
		System.out.println();
		
		
		// C:
		
		System.out.print("Please input a word: ");
		String input = in.next();
		String InvInput = "";
		int l = input.length();
		int i;
		
		for (i = l; i - 1>= 0; i--)
		{
			InvInput += input.substring(i-1, i);
		}
		
		System.out.println(InvInput);
	}

}
