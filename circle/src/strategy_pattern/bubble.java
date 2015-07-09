package strategy_pattern;

public final class bubble {

	public static void main(String[] args) {

			    int n, c, d, swap;
			   // Scanner in = new Scanner(System.in);
			 
			    //System.out.println("Input number of integers to sort");
			   // n = in.nextInt();
			 
			   // int array[] = new int[n];
			    int arr[]={4,3,1,5,2};
			 
			    //System.out.println("Enter " + n + " integers");
			 
			  //  for (c = 0; c < n; c++) 
			   //   array[c] = in.nextInt();
			 
			    for (c = 0; c < 5; c++) {
			      for (d = 0; d < 5- 1; d++) {
			        if (arr[d] > arr[d+1]) /* For descending order use < */
			        {
			          swap       = arr[d];
			          arr[d]   = arr[d+1];
			          arr[d+1] = swap;
			        }
			      }
			    }
			 
			    System.out.println("Sorted list of numbers");
			 
			    for (c = 0; c < 5; c++) 
			      System.out.println(arr[c]);
			  }
			

	

}
