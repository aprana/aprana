package factorydesignpattern;

public class Msc extends Facultymember {
	public Msc(String surname,String qualification){
		this.surname=surname;
		this.qualification=qualification;
		this.surname=surname;
		this.designation="Mr.*";
		
		
	}

	@Override
	public String getDesignation() {
		// TODO Auto-generated method stub
		return designation;
	}

}
