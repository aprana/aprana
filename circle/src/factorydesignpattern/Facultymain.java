package factorydesignpattern;

public class Facultymain {

	public static void main(String[] args) {
	
		Facultyfactor ff=new Facultyfactor();
		
		Facultymember 
		
		fm=ff.getFacultymember("Kamat", "Phd");
		System.out.println("Hello" + fm.getDesignation() + fm.getSurname());
		
		 fm=ff.getFacultymember("Matha", "Msc");
		System.out.println("Hello" + fm.getDesignation() +fm.getSurname());
		
		

	}

}
