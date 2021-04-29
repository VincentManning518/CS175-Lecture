
public class Employee {

	String name;
	double salary;
	
	public Employee (String employeeName, double employeeSalary)
	{
		name = employeeName;
		salary = employeeSalary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void raiseSalary(double percent)
	{
		percent = percent / 100;
		salary = salary + (salary * percent);
	}
}
