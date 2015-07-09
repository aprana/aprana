package facade_cricket;

public class Player_selection {
	
	private Runs_scored rs=new Runs_scored();
	private wicket_taken wt=new wicket_taken();
	private Boundary_scored bs=new Boundary_scored();	
	
	 public Boolean isfit(Player b){
		 if(!rs.hasEnoughrun(b) ||!wt.hasEnoughwicket(b) || !bs.hasEnoughboundary(b))
		 {
			 return false;
			 
		 }
		 return true;
	 }
	
	

}
