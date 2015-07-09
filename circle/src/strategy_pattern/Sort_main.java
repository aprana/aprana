package strategy_pattern;

public class Sort_main {

	public static void main(String[] args) {
		
		
		int arr[]={4,3,1,5,2};
		SortedArray sa=new SortedArray();
		 int choice=2;
		 
		  if(choice==1){
			  sa.setSortStrategy(new Selection_sort());
			  		sa.sort(arr);	  
		  }
		  else if(choice==2){
			  sa.setSortStrategy(new Inserton_sort());
			  		sa.sort(arr);
			  
		  }
		  else {
			  sa.setSortStrategy(new Bubble_sort());
			  		sa.sort(arr);
		  }
		  
		

	}

}
