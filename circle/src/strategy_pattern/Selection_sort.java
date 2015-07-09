package strategy_pattern;

public class Selection_sort extends SortStrategy  {
	
	  public void sort(int[] b){
	         
		  //int N = b.length;
	        int i, j, pos, temp;
	        for (i = 0; i < 5; i++)
	        {
	            pos = i;
	            for (j = i+1; j < 5; j++)
	            {
	                if (b[j] < b[pos])
	                {
	                    pos = j;
	                }
	            }
	            /* Swap arr[i] and arr[pos] */
	            temp = b[i];
	            b[i] = b[pos];
	            b[pos]= temp;            
	        }        
	
	        System.out.println("Selection sort ..................");
			 
	        for (i = 0; i < 5; i++) 
		      System.out.println(b[i]);
		  }
	  	}

