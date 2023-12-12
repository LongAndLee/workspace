package abstractClass;

public class ShapeArray {

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle(2,3,4);
		Circle c1 = new Circle(3);
		Rectangle s1 = new Rectangle(2,2);
		
		Shape[] shapeArray = new Shape[] {t1, c1, s1};
		
		for(int i = 0; i < 3; ++i) {
			System.out.println(shapeArray[i]);
		}
		
	}

}
