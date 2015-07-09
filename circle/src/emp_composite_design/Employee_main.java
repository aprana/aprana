package emp_composite_design;

public class Employee_main {

	public static void main(String[] args) {
		
		
		Employee principal=new Employee("Princial",100000);
		Employee viceprincipalScience=new Employee("Vice-Princial Science",80000);
		Employee viceprincipalArt=new Employee("Vice-Princial Art",60000);
		
		principal.add(viceprincipalScience);
		principal.add(viceprincipalArt);
		
		Employee HODphilospy= new Employee("HOD-Philosopy",50000);
		Employee HODsocialogy= new Employee("HOD-Socialogy",50000);
		Employee HODlogic= new Employee("HOD-Logic",50000);
		
		viceprincipalArt.add(HODphilospy);
		viceprincipalArt.add(HODsocialogy);
		viceprincipalArt.add(HODlogic);
		
		Employee HODphysics= new Employee("HOD-Physics",55000);
		Employee HODchemistry= new Employee("HOD-Chemistry",55000);
		Employee HODbiology= new Employee("HOD-Biology",55000);
		
		viceprincipalScience.add(HODphysics);
		viceprincipalScience.add(HODchemistry);
		viceprincipalScience.add(HODbiology);
		
		
		System.out.println("The salary of principal is:"+principal.calcSal());
		System.out.println("The salary of vice-principal of arts is:"+viceprincipalArt.calcSal());
		System.out.println("The salary of vice-principal of science is:"+viceprincipalScience.calcSal());
		
	}

}
