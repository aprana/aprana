package decorator_ConstructionProject;

public class Shop  extends ConstructionProject{
	
	private String shopid;
	
	

	public Shop(String shopid,String owner) {
		
		this.shopid = shopid;
		this.owner = owner;
	}



	@Override
	public void display() {
		System.out.println("Shop id is : "  +shopid + "  Owner is :" +owner);
		
	}

}
