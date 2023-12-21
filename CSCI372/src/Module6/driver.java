package Module6;

public class driver {

	static void printList(student[] s) {
		
		System.out.println("Students:");
		
		for(int i = 0; i < s.length; ++i){
			
			System.out.println("name: " + s[i].name + " number: " + s[i].rollno + " address: " + s[i].address);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		student lee = new student( 1, "lee", "new york");
		student jack = new student( 2, "jack", "dallas");
		student alex = new student( 3, "alex", "LA");
		student britney = new student( 4, "britney", "san jose");
		student nicolle = new student( 5, "nicolle", "san francisco");
		student zendaya = new student( 6, "zendaya", "palms spring");
		student peter = new student( 7, "peter", "kansas");
		student tom = new student( 8, "tom", "las vegas");
		student walter = new student( 9, "walter", "new mexico");
		student kevin = new student( 10, "kevin", "boston");

		student[] list = new student[] {peter, britney, jack, tom, walter, kevin, zendaya, lee, alex, nicolle};
		
		printList(list);
	
		
		selectionSortByName.nameSort(list);
		
		System.out.print("SORT BY NAME ");
		printList(list);
		
		selectionSortByNum.numSort(list);
		
		System.out.print("SORT BY ROLL ");
		printList(list);
		
	}

}
