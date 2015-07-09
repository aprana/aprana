package diskAdaptorObject;

public class Disk {
	
	 String output;
	 
	 public Disk(){
		 output ="3 and 1/2 inch ready to use";
	 }
	 
	 public void receive_input(String s){
		 output ="s";
	 }
	 public void display_output(){
		System.out.println(output);
	 }
}
