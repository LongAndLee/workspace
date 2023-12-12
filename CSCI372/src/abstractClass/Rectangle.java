package abstractClass;

public class Rectangle extends Shape {

	private double width;
	private double length;
	
	Rectangle(double w, double l){
		this.width = w;
		this.length = l;
		area();
		perimeter();
	}

	@Override
	public double area() {
		
		return area = width * length;
		
	}

	@Override
	public double perimeter() {

		return perimeter = 2*width + 2*length;
		
	}
	
	@Override
	public String toString(){
		return "Rectangle Area: " + area + " Perimeter: " + perimeter;
	}
	
}
