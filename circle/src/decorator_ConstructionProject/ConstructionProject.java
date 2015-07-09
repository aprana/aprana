package decorator_ConstructionProject;

public abstract class ConstructionProject {
	String owner;
	protected float area;
	 public abstract void display();
	 
	 
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	 

}
