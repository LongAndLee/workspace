package abstractClass;

public class Driver {

	public static void main(String[] args) {
		
		Rectangle left = new Rectangle( 2,4 ); 

		System.out.println(left);
		
		Circle c1 = new Circle(5);
		
		System.out.println(c1);
		
		Triangle t1 = new Triangle(3, 5, 6);
		
		System.out.println(t1);
	}

}
