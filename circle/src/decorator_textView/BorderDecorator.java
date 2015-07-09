package decorator_textView;

public class BorderDecorator extends Decorator {

	public BorderDecorator(VisualComponent element) {
		super(element);
		
	}
	
	public void draw(){
		element.draw();
		System.out.println("A Border  is created \n");
	}

}
