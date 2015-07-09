package emp_composite_design;

import java.util.ArrayList;

public class Employee {
		
	private String designation;
	private double salary;
	private ArrayList<Employee> subordinate;
	
	
	public Employee(String designation, double salary) {
		
		this.designation = designation;
		this.salary = salary;
		subordinate =new ArrayList<Employee>();
		
	}
	
	

	public void add(Employee e){
		subordinate.add(e);
		
	}
	
	public double calcSal(){
		double total=salary;
		
		for(int i=0;i<subordinate.size();i++)
		{
			total+=((Employee)subordinate.get(i)).calcSal();
		}
		return total;
	}
	
	
}
