package proxy_with_facade;

public class Tv_controller implements Controller {
	
	Powerunit pu=new Powerunit();
	SoundUnit su=new SoundUnit();
	DisplayUnit du=new DisplayUnit();
	int flag=1;
	public void on(){
		
		if(flag==1)
		{
		System.out.println("TV is on");				
		su.soundon();
		du.channelon();
		
		}
		
		else 
			System.out.println("TV is off");	
		
			
	}
	public void off(){
		
		if(flag==1)
		{
		System.out.println("\nTV is off");		
		pu.poweroff();
		su.soundoff();
		du.channeloff();
			
		}
		else	
		System.out.println("\nTV is on");	
	}
	
	public void volup(){
				
		if(flag ==1){
			System.out.println("\nTV is on");	
			System.out.println("volume up ");	
		su.soundon();
		su.soundup();
		}		
		//du.channelup();
		}
		
		
		
	

	public void voldown(){
		if(flag==1){
			System.out.println("\nTV is on");	
			System.out.println("volume down");	
		pu.poweron();
		su.soundon();
		su.sounddown();
		}
			
	
	}
	
	public void Screenon(){
		if(flag==1){
		pu.poweron();
		su.soundon();
		su.soundup();
		du.channelup();
		//System.out.println("Screen is on");
		}
		
	}
	
	public void Screenoff(){
		if(flag==1){
		pu.poweroff();
		su.soundoff();
		}
		//du.channeldown();
		//System.out.println("No current is there");
		
		
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
