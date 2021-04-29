import java.util.Scanner;
public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("Please input your weight(in pounds): ");
		double weightLBS = in.nextDouble();
		
		System.out.print("Please input your height(in inches): ");
		double heightIN = in.nextDouble();
		
		double weightKGS = weightLBS * 0.45;
		double heightM = heightIN * 0.0254;
		
		double BMI = weightKGS / (heightM * heightM);
		
		if (BMI >= 30.0)
		{
			System.out.println("The BMI shows you are: Obese");
		}
		
		else if (BMI >= 25.0)
		{
			System.out.println("The BMI shows you are: Overweight");
		}
		
		else if (BMI >= 18.5)
		{
			System.out.println("The BMI shows you are: Normal Weight");
		}
		
		else if (BMI < 18.5)
		{
			System.out.println("The BMI shows you are: Underweight");
		}
	}

}
