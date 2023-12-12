package abstractClass;

public class Triangle extends Shape {

	double side1;
	double side2;
	double side3;
	
	Triangle(double s1, double s2, double s3){
		
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
		
		area();
		perimeter();
		
	}
	
	@Override
	public double area() {
		
		double s = (side1 + side2 + side3)/2 ;
		return area = (double)Math.sqrt(s * (s - side1) * (s - side2) * (s- side3));
		
	}

	@Override
	public double perimeter() {
		
		return perimeter = side1 + side2 + side3;
		
	}
	
	@Override
	public String toString() {
		return "Triangle Area: " + area + " Perimeter: " + perimeter;
	}

}
