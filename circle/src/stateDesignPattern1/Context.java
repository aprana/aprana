package stateDesignPattern1;

public class Context {

	private State state;
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Context(State s) {
		//super();
		state = s;
	}
	public void switchState(){
		state.Switch(this);
	}

	
	public String getStateName() {
		// TODO Auto-generated method stub
		return state.statename;
	}

	

}
