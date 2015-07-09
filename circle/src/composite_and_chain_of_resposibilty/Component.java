package composite_and_chain_of_resposibilty;

public abstract class Component {
	
	WindowContainor predecessor;
	
	public abstract void help();
	
	public void addPredecessor(WindowContainor parent){
		
		predecessor=parent;
	}
	

}
