package Module6;

public class selectionSortByName {

	static public void nameSort(student[] a) {
		
		//Initialize variable 
		int n = a.length;
		int min;
		
		//main for loop to go through every element
		for(int i = 0; i < n ; ++i) {
			
			min = i;
			
			//nested for loop to go through the rest of element to search for min
			for(int j = i+1 ; j < n; ++j ) {
				
				String q = a[j].name;
				String p = a[min].name;
				
				
				if (q.charAt(0) < p.charAt(0) ) 
					min = j;
				
					
			}
			
			//swap min with current element before moving on
			student temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		
		}
		
	}
	
}


