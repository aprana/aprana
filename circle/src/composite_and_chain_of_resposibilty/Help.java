package composite_and_chain_of_resposibilty;

public class Help {

	public static void main(String[] args) {
		
		WindowContainor wc1 = new WindowContainor();
		WindowContainor wc2 = new WindowContainor();
		
		Control b = new Label();
		Control l = new ListBox();
		Control r = new Radio();
		System.out.println("*********************************");
		wc1.addElement(l);
		wc1.addElement(r);
	
		System.out.println("*********************************");
		wc2.addElement(l);
		wc2.addElement(r);
		
		
		System.out.println("*********************************");
		b.help();
		l.help();
		r.help();
		
		

	}

}
