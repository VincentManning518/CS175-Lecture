import java.awt.Rectangle;
public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Question1:
		System.out.println("Question 1: ");
		System.out.println();

		String message = "Hello";
		System.out.println(message);
		
		message = message.replace('H', 'h');
		System.out.println(message);
		
		message = message.toUpperCase();
		System.out.println(message);
		System.out.println();
		System.out.println();
		
		//Question2:
		System.out.println("Question 2: ");
		System.out.println();
		
		String subject = "Mississippi";
		System.out.println(subject);
		
		subject = subject.replace('i', '!');
		subject = subject.replace('s', '$');
		
		System.out.println(subject);
		System.out.println();
		System.out.println();
		
		//Question3:
		System.out.println("Question 3: ");
		System.out.println();
		
		Rectangle square = new Rectangle(10,20,40,40);
		
		square.translate(10,0);
		
		System.out.println("coords: " + square.getX());
		System.out.println("coords: " + square.getY());
		System.out.println("width: " + square.getWidth());
		System.out.println("height: " + square.getHeight());
		System.out.println("perimeter: " + 4 * square.getWidth());
		System.out.println("area: " + square.getWidth() * square.getHeight());
		
	}

}
