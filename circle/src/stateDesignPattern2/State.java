package stateDesignPattern2;


public abstract class State {

protected String statename;
	
	public String getStatename() {
		return statename;
	}

	public abstract void Switch(Context c);
}
