
public class Circle {

	double radius;
	double x, y;
	String color;
	
	public Circle()
	{
		radius = 1;
		x = 0;
		y = 0;
		color = "Black";
	}
	
	public Circle(double Rad, double X, double Y, String Col)
	{
		radius = Rad;
		x = X;
		y = Y;
		color = Col;
	}
	
	public void SetRadius(double newRad)
	{
		radius = newRad;
	}
	
	public void SetX(double newX)
	{
		x = newX;
	}
	
	public void SetY(double newY)
	{
		y = newY;
	}
	
	public void SetColor(String newCol)
	{
		color = newCol;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public double getArea()
	{
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public double getPerimeter()
	{
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	public double getDiameter()
	{
		double diameter = 2 * radius;
		return diameter;
	}
}
