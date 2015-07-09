package stateDesignPattern2;



public class B extends State{

	public B(){
		statename="B";
	}
	
	
	public void Switch(Context c) {
		C ccc= new C();
		c.setState(ccc);
		System.out.println("State B create  "+ccc.getStatename());		
	}

	public void setState(Context c) {
		// TODO Auto-generated method stub
		
	}


	
	

}
