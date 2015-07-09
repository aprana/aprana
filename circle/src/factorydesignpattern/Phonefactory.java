package factorydesignpattern;

public class Phonefactory {
	
	public Phone getPhone(String nm, String type){
	
		if(type=="Basicphone")
			return new Basicphone(nm);
		
		else if(type=="Smartphone")
			return new Smartphone(nm);
		
		else 
			return null;
		
	}

}
