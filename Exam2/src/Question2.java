import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		double j = 0;
		double count = -1;
		
		System.out.println("Please input integers ending with Q: ");
		
		while (in.hasNextDouble())
		{
			double i = in.nextDouble();
			if (i >= 0)
			{
				j = j + i;
				count++;
			}
		}
		System.out.println(j);
		double avg = j / count;
		System.out.println(avg);
	}

}
