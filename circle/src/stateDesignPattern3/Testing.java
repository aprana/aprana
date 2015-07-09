package stateDesignPattern3;

public class Testing extends State{

	public Testing(){
		statename="Testing";
	}
	
	
	@Override
	public void Switch(Context c) {
		Resolved r= new Resolved();
		c.setState(r);
		System.out.println("State A create  "+r.getStatename());		
	}

}
