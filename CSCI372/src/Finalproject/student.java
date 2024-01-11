package Finalproject;

public class student {
	
	public String name;
	public String address;
	public double gpa;
	
	student(String n, String a, Double g){
		
		name = n;
		address = a;
		gpa = validGPA(g);
		
	}
	
	double validGPA(double gpa) {
		if( gpa < 0.0 || gpa > 4.0 ) {
			return -1;
		}
		return gpa;
	}
	
	String printInfo() {
		System.out.println("Name: " + name + " | address: " + address + " | gpa: " + gpa);
		return "Name: " + name + " | address: " + address + " | gpa: " + gpa;
	}
	
}
