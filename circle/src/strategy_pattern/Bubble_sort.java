package strategy_pattern;

public class Bubble_sort extends SortStrategy {
	
	public void sort(int a[]) {
		
		 int  c, d, swap;
		   
		  	 
		    for (c = 0; c < 5; c++) {
		      for (d = 0; d < 5- 1; d++) {
		        if (a[d] > a[d+1]) /* For descending order use < */
		        {
		          swap       = a[d];
		          a[d]   = a[d+1];
		          a[d+1] = swap;
		        }
		      }
		    }
		 
		    System.out.println("Bubble sort ..................");
		 
		    for (c = 0; c < 5; c++) 
		      System.out.println(a[c]);
		  }
		

}