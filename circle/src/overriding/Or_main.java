package overriding;

public class Or_main {

	public static void main(String[] args) {
		int i=0;
		// TODO Auto-generated method stub
     Employee [] employee=new Employee[5];
       employee[0]=new Junior();
       employee[1]=new Senior();
       employee[2]=new Manager();

     
     employee[0].setId(1);
     employee[0].setName("Rohit");
     employee[0].setSalary(50000);
     
    
     

     
     employee[1].setId(2);
     employee[1].setName("Aprana");
    employee[1].setSalary(60000);
    
    
    employee[2].setId(3);
    employee[2].setName("Roshni");
   employee[2].setSalary(9000);
 
   
   for(i=0 ; i<3 ; i++){
	   employee[i].display();
	   employee[i].increment_salary();
	   
   }
   
	}

		

	}


