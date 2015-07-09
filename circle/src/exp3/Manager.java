package exp3;
import java.util.*;
public class Manager  extends Employee{
	
	
	
	List manager;
	
	ArrayList<Employee> employee;
	
	public   void addteammember(Employee employee){
		manager.add(employee);
	}
	
	List getteammember(){
		return manager;
	}
	
	
	
	
	
}

	