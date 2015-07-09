package stateDesignPattern2;

public class A extends State {
	
	public A(){
		statename="A";
	}
	
	
	@Override
	public void Switch(Context c) {
		B b= new B();
		c.setState(b);
		System.out.println("State A create  "+b.getStatename());		
	}


	public void setState(Context c) {
		// TODO Auto-generated method stub
		
	}


	

	

}
