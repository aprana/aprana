package cricket_observer;

public class Demo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Publisher subject = new Server();

	      

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	}

}
