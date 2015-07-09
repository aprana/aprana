package factorydesignpattern;

public class Facultyfactor {
	
	public Facultymember getFacultymember(String surname,String qualification){
		if(qualification.equals("Phd"))
			return new Phd(surname,qualification);
		else
			if(qualification.equals("Msc"))
				return new Msc(surname,qualification);
			else return null;	
			
		
	}

}
