package facade_cricket;

public class Demo {

	public static void main(String[] args) {
	Player P=new Player();
	Player_selection ps=new Player_selection();
	boolean isworthy = true;

	P.setName("Rahul");
	P.setRuns_scored(999);
	P.setBoundaries_scored(25);
	P.setWicket_taken(5);
	

	
	
	if (isworthy){
		System.out.println("Player:" +P.getName()+" has \nRuns=" +P.getRuns_scored() + "\nBoundaries=" +P.getBoundaries_scored() + "and \n wicket=" +P.getWicket_taken()  + ".\nSO he is eligible for selection");
		
	}
	

	}

}
