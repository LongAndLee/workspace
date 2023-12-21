package Module6;



public class selectionSortByName {

	static public void nameSort(student[] a) {
		
		int n = a.length;
		int min;
		
		for(int i = 0; i < n ; ++i) {
			
			min = i;
			
			for(int j = i+1 ; j < n; ++j ) {
				
				String q = a[j].name;
				String p = a[min].name;
				
				
				if (q.charAt(0) < p.charAt(0) ) 
					min = j;
				
					
			}
			
			
			student temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		
		}
		
	}
	
}


