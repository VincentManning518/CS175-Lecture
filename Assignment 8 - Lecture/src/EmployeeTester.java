
public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee("Vincent", 50000);
		
		System.out.println("Name of Employee: " + emp1.getName());
		System.out.println("Salary of Employee: " + emp1.getSalary());
		System.out.println("Raising salary by 10%...");
		emp1.raiseSalary(10);
		System.out.println("New salary: " + emp1.getSalary());
		
	}

}
