package Finalproject;
import java.util.LinkedList;
import java.util.Scanner;

public class driver {

	public static void main(String[] args) {

		LinkedList<student> students = new LinkedList<student>();
		
		for(int i = 0; i < 5; ++ i ) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter name, address and gpa:");
			String name = input.nextLine();
			String address = input.nextLine();
			double gpa = input.nextDouble();
			
			student x = new student(name, address, gpa);
			
			int index = iterateToInsert(students, x.name);
			
			students.add(index, x );

		}

		WriteToTxt.writeToText(students);
		
		for(int i = 0; i < students.size(); ++i) {
			
			students.get(i).printInfo();
			
		}
		
	}
	
	public static int iterateToInsert(LinkedList<student> l, String q) {
		if(!l.isEmpty()) {
		
			for(int i = 0; i < l.size(); ++ i) {
				
				String p = l.get(i).name;
								
				if(q.charAt(0) < p.charAt(0)) {
					
					return i;
				}
				
			}
			
			return l.size();
			
		}
		return 0;
	}

}
