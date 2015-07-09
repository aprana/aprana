package facade_cricket;

public class Boundary_scored {
	public Boolean hasEnoughboundary(Player b){
	if (b.getBoundaries_scored()>4)
	{
		return true;
	}
		return false;
		
	}

}
