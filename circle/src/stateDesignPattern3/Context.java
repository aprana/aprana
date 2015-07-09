package stateDesignPattern3;

public class Context {
	
private State state;
	
	public State getState() {
		return state;
	}

	public void setState(State fd) {
		this.state = fd;
	}

	public Context(State s) {
		//super();
		state = s;
	}

	public void setState(WorkInProgress w) {
		// TODO Auto-generated method stub
		
	}

	public void setState(Fixed fd) {
		// TODO Auto-generated method stub
		
	}

	public void setState(Testing t) {
		// TODO Auto-generated method stub
		
	}

	public void Switch() {
		// TODO Auto-generated method stub
		
	}
	
	

}
