package stateDesignPattern2;

public class C extends State {

	public C(){
		statename="C";
	}
	
	
	public void Switch(Context c) {
		A a= new A();
		a.setState(c);
		System.out.println("State C create  "+a.getStatename());		
	}


	public void setState(Context c) {
		// TODO Auto-generated method stub
		
	}


}
