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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
