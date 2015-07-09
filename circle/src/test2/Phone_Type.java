package test2;
public class Phone_Type {
	int id;
	String model_type;
	
	Phone_Type(){
		
	}
	
    Phone_Type(int id,String model_type){
    	this.id=id;
    	this.model_type=model_type;
		
	}
    
    Phone_Type(String model_type){
    	this.id=0;
    	this.model_type=model_type;
		
	}
	
	void check_utilities(){
		if(model_type.equals("Basic Phone")){
			Basic_Phone b = new Basic_Phone();
			System.out.println(id + "-" + model_type);
			b.call();
			b.sms();
			b.clock();
			
		}
		if(model_type.equals("Smart Phone")){
			Smart_Phone s = new Smart_Phone();
			System.out.println(id + "-" + model_type);
			s.call();
		    s.sms();
			s.clock();
			s.game_station();
			s.gps();
			
		}
			
			
	}
	void call(){
		System.out.println("I am calling........");
	}
	
	void sms(){
		System.out.println("I am sending sms........");
	}
	
	void clock(){
		System.out.println("I am showing time........");
	}

}
