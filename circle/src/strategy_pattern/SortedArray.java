package strategy_pattern;

public class SortedArray {
	private SortStrategy s;
	int[] arr;
	
	public void setSortStrategy(SortStrategy s)
	{
		this.s=s;
		
	}
	
	public void sort(int[] arr){
		s.sort(arr);
	}


	
}
