package proxy_with_facade;

public class Remote_controller implements Controller {
	
	Tv_controller tvc= new Tv_controller(); 
	
	
public void on(){
	tvc.on();
		
	}
	public void off(){
		tvc.off();
		
		
	}
	
	public void volup(){
		tvc.volup();
		
	}

	public void voldown(){
		tvc.voldown();
	
	}
	
	public void channelup(){
		tvc.Screenon();
		
	}
	
	public void channeldown(){
		tvc.Screenoff();
	}
	@Override
	public void screenon() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void screenoff() {
		// TODO Auto-generated method stub
		
	}

}
