package Admission;

public class Collage {
	
		String name;
		int numSeats;
		int numFilled;
		String status;
		public Collage(String name, int numSeats) {
			this.name = name;
			this.numSeats = numSeats;
			numFilled=0;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getNumSeats() {
			return numSeats;
		}
		public void setNumSeats(int numSeats) {
			this.numSeats = numSeats;
		}
		public int getNumFilled() {
			return numFilled;
		}
		public void setNumFilled(int numFilled) {
			this.numFilled = numFilled;
		}
		 public void isSeatAvailable(){
		    	if(numFilled<=numSeats)
				   status="true";
			   else
				   status="false";
				   
			   
		   }
		  
			 
			  
		 
		 
		 public void allot(){
		     numFilled++;
		 }
		 
		 public void printStatus(String status){
			 System.out.println(status);
		 }
		 
		 }



