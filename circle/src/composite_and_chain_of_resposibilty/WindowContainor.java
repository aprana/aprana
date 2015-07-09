package composite_and_chain_of_resposibilty;

import java.util.ArrayList;


public class WindowContainor extends Component{

	ArrayList<Component> element= new ArrayList<Component>();
	
	public void help(){
		
		System.out.println("I am a window cotainor\n");
	}
	
	public void addElement(Component c){
		if(predecessor!=null)
		{
			c.addPredecessor(this);
			element.add(c);
		}
		else 
		{
			System.out.println("Predessor not specified\n");
		}
		
	}
	
	
}
