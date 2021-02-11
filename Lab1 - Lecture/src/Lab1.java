
public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 123 / 100;
				System.out.print(a);
				
		int b = 123 / 60;
				System.out.print(b);
				
		int c = 123 % 120;
				System.out.println(c);
				
		String greeting = "Hello";
		String name = "Vincent";
		System.out.println(greeting + " " + name);
		
		double width = 20.4;
		double length = 10.2;
		double area = length * width;
		double perimeter = 2 * length + 2 * width;
		System.out.println(area + " " + perimeter);
		
		int hoursWorked = 40;
		int payRate = 10;
		System.out.println(hoursWorked);
		System.out.println(payRate);
		int salary = hoursWorked * payRate;
		System.out.println(salary);
		
		double x;
		x = 0.1;
		System.out.print("At x=0.1, the quadratic value is: ");
		double value = (3*((x)*(x))) - (8*(x)) + 4;
		System.out.println(value);
		
		x = 2.1;
		System.out.print("At x=2.1, the quadratic value is: ");
		value = (3*((x)*(x))) - (8*(x)) + 4;
		System.out.println(value);
		
		x = 4.5;
		System.out.print("At x=4.5, the quadratic value is: ");
		value = (3*((x)*(x))) - (8*(x)) + 4;
		System.out.println(value);
		
	}

}
