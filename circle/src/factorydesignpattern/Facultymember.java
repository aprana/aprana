package factorydesignpattern;

abstract public class Facultymember {
	
	protected String surname;
	protected String qualification;
	protected String designation;
	
	public String getSurname() {
		return surname;
	}
	
	abstract public String getDesignation();
	


}
