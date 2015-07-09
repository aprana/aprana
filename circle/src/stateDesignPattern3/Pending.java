package stateDesignPattern3;

public class Pending extends State {
	
	public Pending(){
		statename="Pending";
	}
	
	
	@Override
	public void Switch(Context c) {
		WorkInProgress w= new WorkInProgress();
		c.setState(w);
		System.out.println("State A create  "+w.getStatename());		
	}


}
