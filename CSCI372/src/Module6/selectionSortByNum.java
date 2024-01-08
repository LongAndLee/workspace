package Module6;

public class selectionSortByNum {

static public void numSort(student[] a) {
		
		//Initialize variable 
		int n = a.length;
		int min;
		
		//main for loop to go through every element
		for(int i = 0; i < n ; ++i) {
			
			min = i;
			
			//nested for loop to go through the rest of element to search for min
			for(int j = i+1 ; j < n; ++j ) {
				
				int q = a[j].rollno;
				int p = a[min].rollno;
				
				
				if (q < p ) 
					min = j;
				
					
			}
			
			//swap min with current element before moving on
			student temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		
		}
		
	}
	
	
}
