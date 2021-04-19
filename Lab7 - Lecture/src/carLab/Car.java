package carLab;

public class Car {
	
	double fuelLevel;
	double Eff;
	
	public Car (double fuelEff)
	{
		fuelLevel = 0;
		Eff = fuelEff;
	}
	
	public void Drive (double miles)
	{
		double gasUsed = miles/Eff;
		fuelLevel = fuelLevel - gasUsed;
	}
	
	public double getGasinTank()
	{
		return fuelLevel;
	}
	
	public void addGas(double amt)
	{
		fuelLevel = fuelLevel + amt;
	}
	

}
