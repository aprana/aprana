package diskAdaptorclass;



public class Adapter extends Disk implements Drive {
    private String s ;	
	public void send_output(String s){		
				
		receive_input(s);
		
	}

}
