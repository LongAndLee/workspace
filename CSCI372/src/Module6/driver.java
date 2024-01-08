package Module6;

public class driver {

	public static void main(String[] args) {
		
		//create students
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

		//add students to list
		student[] list = new student[] {peter, britney, jack, tom, walter, kevin, zendaya, lee, alex, nicolle};
		
		student.printList(list);

		//selection sort by name 
		selectionSortByName.nameSort(list);
		
		System.out.print("SORT BY NAME ");
		student.printList(list);
		
		//selection sort by number
		selectionSortByNum.numSort(list);
		
		System.out.print("SORT BY ROLL ");
		student.printList(list);
		
	}

}
