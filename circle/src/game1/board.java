package game1;

import java.util.Random;

public class board {
	String name;
	int size=3;
	cell[][] arr =new cell[size][size];
	void initialize(){
		int i,j;
		Random randomGenerator = new Random();
		for(i=0;i<size;i++){
			
			for(j=0;j<size;j++){
			  arr[i][j]=new cell(randomGenerator.nextInt(2));
			}
			
		}
		
	}
	

	void check(){
		int i,j;
		for(i=0;i<size;i++){
			for(j=0;j<size;j++){
				arr[i][j].alivecount=0;
			          check2(i,j);
				   }
			}
		}

	
	void play(){
		
		int i,j;
		for(i=0;i<size;i++){
			for(j=0;j<size;j++){
			        if(arr[i][j].getStatus()==1){
			             	
				      if(arr[i][j].alivecount<2){
				    	  arr[i][j].setStatus(0);
				    	  
				    	  
				      }
				      if(arr[i][j].alivecount>3){
				    	  arr[i][j].setStatus(0);
				    	  
				    	  
				      }
				   }
			        
			        if(arr[i][j].getStatus()==0){
		             	
					    
					      if(arr[i][j].alivecount==3){
					    	  arr[i][j].setStatus(1);
					    	   
					      }
					   }
			}
		}
		
	}

	
	void check2(int row,int col){
		int i,j,r,c;
		i=row;
		j=col;
	
		for ( r=row-1;r<row+1;r++){
		for(c=col-1;c<col+1;c++){
		 if(r>=0 && c<size && r<size && c>=0){
		if(arr[r][c].getStatus()==1){
		arr[i][j].alivecount=arr[i][j].alivecount+1;
					
		}
				 
		}
				
		 
		}
		
	  }
     }
		
	
  void check3(){
		
		int i,j=0;
		boolean flag1=false;
		for(i=0;i<size;i++){
	     {
		    for(j=0;j<size;j++){
		    	if(arr[i][j].getStatus()==0){
		            flag1=true;  		
		    	}
		    	else{
		    		flag1=false;
		    		break;
		    	}
		    	
		    }
		   
		    if(flag1==true){
		    	 System.out.print(""+flag1+"---");
				for(int coli=0;coli<size;coli++){
					for(int rowj=coli;rowj<coli+1;rowj++){
					    arr[coli][rowj].setStatus(1);    
					      
					}
				}
		    }
	    	 
	      }
		}
		
	}
  void check4(){
		
		int i,j=0;
		boolean flag1=false;
   for(j=0;j<size;j++){
		for(i=0;i<size;i++){
	     {
		  
		    	if(arr[i][j].getStatus()==0){
		            flag1=true;  		
		    	}
		    	else{
		    		flag1=false;
		    		break;
		    	}
		    	
		    }
		    if(flag1==true){
					for(int rowj=j;rowj<size;rowj++){
						for(int coli=i;coli<i+1;coli++){
					       arr[coli][rowj].setStatus(1);    
					       
					}
				}
		    }
	    	 
	      }
		}
		
	}
  
	void display(){
		int i,j;
		String x;
		System.out.println("This Name of generation is "+name);
		for(i=0;i<size;i++){
			for(j=0;j<size;j++){
				if(arr[i][j].getStatus()==1){
					x="@";
				}
				else{
					x="#";
				}
				
				   System.out.print(" "+x+" ");
			}
			System.out.println("");
		}
	}
}
