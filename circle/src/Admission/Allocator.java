package Admission;



	public class Allocator {
		 Candidate [] candidate;
		 Collage [] collage;
		 

		  public void read() {
			  
			 collage=new Collage[5];
			collage[0]=new Collage("GMC",4);
			collage[1]=new Collage("PCC",2);		  
			
			collage[2]=new Collage("GEC",2);
			 collage[3]=new Collage("MDU",1);
			  collage[4]=new Collage("SMU",3);
			  
			  
			 //  System.out.println("Enter the number of candidates ");
			   candidate= new Candidate[3];
			   String temp[]={"GMC","SMU"};
			   
				  candidate[0]=new Candidate(1001,99,temp);
				  String temp1[]={"GMC","SMU","MDU"};
				  
				  candidate[1]=new Candidate(1002,98,temp1);
				  String temp2[]={"GMC"};
				  candidate[2]=new Candidate(1003,96,temp2);
				 // candidate[3]=new Candidate(1004,80,"PCC","SMU");
				 // candidate[4]=new Candidate(1005,78,"MDU");

				  

		  }
		  
		  
		  public void allocate(){
			 int i;
			
			 for(i=0 ; i<candidate.length ; i++){
				// for(j=0 ; j<4 ;j++){
				if(candidate[i].getPreference()==null){
					System.out.println("it has no preferences\n");
							
				}
 
				 
				 
				 }	 
			 }
			  
		  
		  
		  public void print(){
			  for(int i=0 ; i<candidate.length ; i++){
			  System.out.println(candidate[i].collage);
		  }
		  }
		}



