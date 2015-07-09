package business_example;

import java.util.ArrayList;



public class Item  extends Inventory{

	 int item_id;
	 String item_name;
	 int price;
	 int quantity;
	
	 
	 public ArrayList<Inventory> getItems() {
		return items;
	}



	public void setItems(ArrayList<Inventory> items) {
		this.items = items;
	}



	ArrayList<Inventory> items; 
	 
	 
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}


	
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	
	
	
	
}
