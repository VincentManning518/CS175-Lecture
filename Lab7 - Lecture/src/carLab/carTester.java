package carLab;

public class carTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car(20);
		myCar.addGas(50);
		myCar.Drive(100);
		
		double gasLeft = myCar.getGasinTank();
		System.out.println(gasLeft + " gallons of gas left");
		
	}

}
