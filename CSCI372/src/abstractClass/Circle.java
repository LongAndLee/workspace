package abstractClass;

public class Circle extends Shape{

	double radius;
	
	Circle(double r){
		this.radius = r;
		area();
		perimeter();
	}
	
	@Override
	public double area() {
		
		return area = 3.14 * radius * radius;
		
	}

	@Override
	public double perimeter() {
		
		return perimeter = 2 * 3.14 * radius;
		
	}

	@Override
	public String toString() {
		return "Circle Area: " + area + " Circumference: " + perimeter;
	}
	
}
