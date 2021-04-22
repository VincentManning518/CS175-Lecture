
public class circleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle myCircle = new Circle(2.5, 0, 0, "red");
		
		System.out.println(myCircle.getColor());
		System.out.println(myCircle.getRadius());
		System.out.println(myCircle.getX());
		System.out.println(myCircle.getY());
		System.out.println(myCircle.getDiameter());
		System.out.println(myCircle.getPerimeter());
		System.out.println(myCircle.getArea());
		
		myCircle.SetRadius(3.5);
		myCircle.SetX(10.0);
		myCircle.SetY(20.0);
		myCircle.SetColor("black");

		System.out.println(myCircle.getColor());
		System.out.println(myCircle.getRadius());
		System.out.println(myCircle.getX());
		System.out.println(myCircle.getY());
		System.out.println(myCircle.getDiameter());
		System.out.println(myCircle.getPerimeter());
		System.out.println(myCircle.getArea());
	}

}
