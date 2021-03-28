import java.util.Scanner;
public class Assignment5 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);

	//#1:
		//a:
		
		int e = 0, i = 0;
		
		System.out.print("Please input an integer: ");
		int n = in.nextInt();
		System.out.println(" ");
		
		while (e < n)
		{
			System.out.print(e + " ");
			i++;
			e = i * i;
		}
		System.out.println("");
		
		//b:
		i = 0;
		
		while (i < n)
		{
			if (i % 10 == 0)
			{
				System.out.print(i + " ");
			}
			
			i++;
		}
		System.out.println("");

		//c:
		i = 0; e = 0;
	
		while (e < n)
		{
			e = (int) Math.pow(2, i);
			System.out.print(e + " ");
			i++;
			e = (int) Math.pow(2, i);
		}
		System.out.println("");
		
		//d:
		i = 0; e = 0;
		
		while (i <= n)
		{
			e = (int) Math.pow(2, i);
			System.out.print(e + " ");
			i++;
			e = (int) Math.pow(2, i);
		}
		System.out.println("");

	// #2:
		//a:
		
		int evenEnd = 50;
		int p = 1, q = 0;
		
		while (p <= evenEnd)
		{
			
			q = q + (2*p); 
			p++;
			
		}
		System.out.println(q);
		
		//b:
		
		p = 0; q = 0;
		
		while (p <= 100)
		{
			q = q + (p * p);
			p++;
		}
		System.out.println(q);
		
		//c:
		
		int a, b;
		System.out.println("Please input two different integers: ");
		a = in.nextInt();
		b = in.nextInt();
		p = a;
		q = 0;
		
		while (p <= b)
		{
			q = q + ((2*p) +1);
			p++;
		}
		System.out.println(q);
		
		//d:
		
		System.out.print("Please input an integer: ");
		int input = in.nextInt();
		int digit;
		int copy = input;
		int sum = 0;
		
		while(copy > 0)
		{
			digit = copy % 10;
			if (digit % 2 > 0)
			{	
				sum = sum + digit;
			}
			copy = copy / 10;
		}
		System.out.println(sum);
		
		}
	}


