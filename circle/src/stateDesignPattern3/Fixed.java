package stateDesignPattern3;

public class Fixed extends State{

	public Fixed(){
		statename="Fixed";
	}
	
	
	@Override
	public void Switch(Context c) {
		Testing t = new Testing();
		c.setState(t);
		System.out.println("State A create  "+t.getStatename());		
	}
}
