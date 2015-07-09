package stateDesignPattern3;

public class WorkInProgress extends State{
	public WorkInProgress(){
		statename="WorkInProgress";
	}
	
	
	@Override
	public void Switch(Context c) {
		Fixed fd= new Fixed();
		c.setState(fd);
		System.out.println("State A create  "+fd.getStatename());		
	}

}
