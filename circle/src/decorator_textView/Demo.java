package decorator_textView;

public class Demo {

	public static void main(String[] args) {
		
		VisualComponent textview = new TextView();
		VisualComponent scrollbar = new ScrollDecorator(textview);
		 scrollbar.draw();
		VisualComponent border= new ScrollDecorator(scrollbar);
		border.draw();
	}

}
