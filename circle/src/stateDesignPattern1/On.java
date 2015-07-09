package stateDesignPattern1;

public class  On extends State {
	
	public On(){
		statename="ON";
	}

	@Override
	public void Switch(Context c) {
		Off o = new Off();
		c.setState(o);
		System.out.println("State is  "+c.getStateName());
		
		
	}
	

}
