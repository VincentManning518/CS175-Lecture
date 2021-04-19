import java.awt.Rectangle;
public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Question 1:
		System.out.println("Question 1: ");
		System.out.println();
	
		Rectangle square1 = new Rectangle(100,100,50,50);
		Rectangle square2 = square1;
		
		System.out.println("initial coords for square1: " + square1.getX());
		System.out.println();
		System.out.println("initial coords for square1: " + square1.getY());
		System.out.println();

		System.out.println("initial width for square1: " + square1.getWidth());
		System.out.println();

		System.out.println("initial height for square1: " + square1.getHeight());
		System.out.println();

		
		System.out.println("initial coords for square2: " + square2.getX());
		System.out.println();

		System.out.println("initial coords for square2: " + square2.getY());
		System.out.println();

		System.out.println("initial width for square2: " +square2.getWidth());
		System.out.println();

		System.out.println("initial height for square2: " +square2.getHeight());
		System.out.println();

		
		square1.translate(15, 25);
		
		System.out.println("updated coords for square1: " +square1.getX());
		System.out.println();

		System.out.println("updated coords for square1: " +square1.getY());
		System.out.println();

		
		System.out.println("updated coords for square2: " +square2.getX());
		System.out.println();

		System.out.println("updated coords for square2: " +square2.getY());	
		System.out.println();
		System.out.println();

		// Question 2:
		System.out.println("Question 2: ");
		System.out.println();
		
		Rectangle rectangle1 = new Rectangle(20,20,40,20);
		
		System.out.println("initial coords for rectangle1: " + rectangle1.getX());
		System.out.println();

		System.out.println("initial coords for rectangle1: " + rectangle1.getY());
		System.out.println();

		
		Rectangle rectangle2 = new Rectangle(20,20,40,20);
		
		System.out.println("initial coords for rectangle2: " + rectangle2.getX());
		System.out.println();

		System.out.println("initial coords for rectangle2: " + rectangle2.getY());
		System.out.println();


		rectangle1.translate(5,10);

		System.out.println("updated coords for rectangle1: " + rectangle1.getX());
		System.out.println();

		System.out.println("updated coords for rectangle1: " + rectangle1.getY());
		System.out.println();

		
		System.out.println("updated coords for rectangle2: " + rectangle2.getX());
		System.out.println();

		System.out.println("updated coords for rectangle2: " + rectangle2.getY());
		
		
	}

}
