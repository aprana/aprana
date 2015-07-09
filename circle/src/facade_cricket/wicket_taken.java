package facade_cricket;

public class wicket_taken {
	
	public Boolean hasEnoughwicket(Player b){
		if(b.getWicket_taken()>5){
			return true;
		}
		return false;
		
	}

}
