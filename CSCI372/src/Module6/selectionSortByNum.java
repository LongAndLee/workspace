package Module6;

public class selectionSortByNum {

static public void numSort(student[] a) {
		
		int n = a.length;
		int min;
		
		for(int i = 0; i < n ; ++i) {
			
			min = i;
			
			for(int j = i+1 ; j < n; ++j ) {
				
				int q = a[j].rollno;
				int p = a[min].rollno;
				
				
				if (q < p ) 
					min = j;
				
					
			}
			
			
			student temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		
		}
		
	}
	
	
}
