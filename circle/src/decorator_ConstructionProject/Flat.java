package decorator_ConstructionProject;

public class Flat extends ConstructionProject {
	
	private int noOfRoom;
	private String flatid;
	
	public Flat(int noOfRoom, String flatid ,String owner) {
		
		this.noOfRoom = noOfRoom;
		this.flatid = flatid;
		this.owner= owner;
	}


	@Override
	public void display() {
	System.out.println("Flat number is  " +flatid + "  number of rooms are  " +noOfRoom + "  Owner is  " +owner);
		
	}

}
