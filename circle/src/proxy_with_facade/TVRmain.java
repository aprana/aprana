package proxy_with_facade;

public class TVRmain {

	public static void main(String[] args) {
		
		Controller remc= new Remote_controller();
		remc.on();
		remc.off();
		remc.volup();
		remc.voldown();
		remc.screenon();
		remc.screenoff();
		

	}

}
