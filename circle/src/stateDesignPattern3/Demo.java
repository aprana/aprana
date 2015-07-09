package stateDesignPattern3;

public class Demo {

	public static void main(String[] args) {
		Context c = new Context(new Pending());
		c.Switch();
		Context b = new Context(new WorkInProgress());
		b.Switch();
		Context a = new Context(new Testing());
		a.Switch();

	}

	}


