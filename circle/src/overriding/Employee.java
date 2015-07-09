package overriding;

public abstract class Employee {
	int id;
	String name;
	int salary;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}





	public void increment_salary(){
		salary=salary+1000;
		System.out.println("\nUpdated salary " + salary);

		
	}

	public void display(){
		
		System.out.println("\nEmployee id " + id);
		System.out.println("\nEmployee name " + name);
		System.out.println("\nEmployee salary " + salary);


	}
}
	

