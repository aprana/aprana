package decorator_ConstructionProject;

public class Leaseable extends Decorator{
	
	String lease;

	public Leaseable(ConstructionProject cp) {
		super(cp);
			}
	
	public void leaseFlat( String lease){
		this.lease=lease;
	}
  public void disaply(){
	  System.out.println("Flat owner is " +cp.getOwner() + " lease to "+lease);
  }
	
}
