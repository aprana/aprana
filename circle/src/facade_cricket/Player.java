package facade_cricket;

public class Player {
	String name;
	int runs_scored,wicket_taken,boundaries_scored;
	public String getRuns_scored;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns_scored() {
		return runs_scored;
	}

	public void setRuns_scored(int runs_scored) {
		this.runs_scored = runs_scored;
	}

	public int getWicket_taken() {
		return wicket_taken;
	}

	public void setWicket_taken(int wicket_taken) {
		this.wicket_taken = wicket_taken;
	}

	public int getBoundaries_scored() {
		return boundaries_scored;
	}

	public void setBoundaries_scored(int boundaries_scored) {
		this.boundaries_scored = boundaries_scored;
	}

	public void player(String name,int runs_scored,int wicket_taken,int boundaries_scored){
		
		name=this.name;
		runs_scored=this.runs_scored;
		wicket_taken=this.wicket_taken;
		
		
		
		
	}

	
}
