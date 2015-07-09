package Overloading;

public class Employee {

		int id;
		String name;
		int salary;
		int experience;

		public Employee(){
			
		}
		
		public Employee(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public Employee(int id, String name, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		public void increment_salary()
		{
			
			this.salary=salary+1000;
			System.out.println("\n\tUpdat the Salary " + salary);

		}

		public void increment_salary(int increement_by){
			
			this.salary=salary + increement_by;
			System.out.println("\n\tUpdate the Salary " + salary);

		}


		public void increment_salary(int increment_by, boolean exp){
			
			if(exp)
			{
				if(experience >=5)
					this.salary=salary+(increment_by*2);
				else
					this.salary=salary+increment_by;
				System.out.println("\n\tUpdated salary " + salary);

			}
			
				
				
			}
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
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}


		public void display(){
			
			System.out.println("\n\tEmployee_Id " + id);
			System.out.println("\n\tEmployee_Name " + name);
			System.out.println("\n\tEmployee_Salary " + salary);
			System.out.println("\n\tEmployee_Experience " + experience);

			
		}

	
		
	}

