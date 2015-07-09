package strategy_pattern;

public class Inserton_sort extends SortStrategy{
	
	
	public void sort(int[] c){
        
		 // int N = arr.length;
	        int i, j, temp;
	        for (i = 1; i< 5; i++) 
	        {
	            j = i;
	            temp =c[i];    
	            while (j > 0 && temp < c[j-1])
	            {
	                c[j] = c[j-1];
	                j = j-1;
	            }
	            c[j] = temp;            
	        }
	        System.out.println("Inserton sort ..................");
			 
	        for (i = 0; i< 5; i++) 
		      System.out.println(c[i]);
		  }
		
    }

	


