package stateDesignPattern1;

public class Off extends State {

	public Off(){
		statename="OFF";
	}
	
	
	@Override
	public void Switch(Context c) {
		On o= new On();
		c.setState(o);
		System.out.println("State is  "+c.getStateName());		
	}
	
}
