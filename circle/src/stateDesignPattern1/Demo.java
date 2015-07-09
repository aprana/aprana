package stateDesignPattern1;

public class Demo {

	public static void main(String[] args) {
		Context c = new Context(new Off());
		c.switchState();
		c.switchState();
		c.switchState();
		c.switchState();

	}

}
