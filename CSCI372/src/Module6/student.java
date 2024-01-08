package Module6;

public class student {

	int rollno;
	String name, address;
	
	//constructor to initialize value of student
	student(int r, String n, String a){
		
		rollno = r;
		name = n;
		address = a;
		
	}
	
	//print statement
	static void printList(student[] s) {
		
		System.out.println("Students:");
		
		for(int i = 0; i < s.length; ++i){
			
			System.out.println("name: " + s[i].name + " number: " + s[i].rollno + " address: " + s[i].address);
			
		}
	}
	
}
