package Overloading;

public class Old_main {

	public static void main(String[] args) {
		  Employee employee=new Employee(1358,"Aprana",30000);
		  
		  employee.setSalary(5000);
		  employee.setExperience(6);
		  employee.display();
		  
		  employee.increment_salary();
		  
		  employee.increment_salary(7000);
		  
		  employee.increment_salary(1000);
		  
		   
			}

	}


