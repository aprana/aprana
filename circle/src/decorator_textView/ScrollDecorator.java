package decorator_textView;

public class ScrollDecorator extends Decorator{

	public ScrollDecorator(VisualComponent ele) {
		super(ele);
		
	}
	
	public void draw(){
	 element.draw();
	 System.out.println("A Scroll bar is created \n");
	}

}
