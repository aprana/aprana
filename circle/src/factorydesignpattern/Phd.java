package factorydesignpattern;

public class Phd  extends Facultymember{
	
	public Phd(String surname,String qualification){
		this.surname=surname;
		this.qualification=qualification;
		this.surname=surname;
		this.designation="Dr.*";
		
		
	}

	@Override
	public String getDesignation() {
		// TODO Auto-generated method stub
		return designation;
	}

}
