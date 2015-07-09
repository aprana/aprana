package stateDesignPattern2;



public class Demo {

	public static void main(String[] args) {
		Context c = new Context(new A());
		c.switchState();
		Context b = new Context(new B());
		b.switchState();
		Context a = new Context(new C());
		a.switchState();

	}

	}


