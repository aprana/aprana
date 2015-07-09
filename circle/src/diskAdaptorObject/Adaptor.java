package diskAdaptorObject;

public class Adaptor implements Drive{
	
	Disk d;
	
	public void send_output(Disk d,String s){
		this.d=d;
		d.receive_input(s);
		
	}

}
