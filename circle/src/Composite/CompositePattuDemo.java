package Composite;

public class CompositePattuDemo {

	 public static void main(String args[])
	 {
		 Employee princi=new Employee("Principal", 400000);
		 Employee vparts=new Employee("VPArts", 300000);
		 Employee vpsci=new Employee("VPScience", 300000);
		 
		 princi.add(vparts);
		 princi.add(vpsci);
		 
		 Employee hodPhilo=new Employee("HoDPhilosophy", 200000);
		 Employee hodLitr=new Employee("HoDLiterature", 200000);
		 Employee hodSocio=new Employee("HoDSociology", 200000);
		 Employee hodEco=new Employee("HoDEconomics", 200000);
		 
		 vparts.add(hodPhilo);
		 vparts.add(hodLitr);
		 vparts.add(hodSocio);
		 vparts.add(hodEco);
		 
		 Employee hodPhys=new Employee("HoDPhysics", 200000);
		 Employee hodChem=new Employee("HoDChemistry", 200000);
		 Employee hodMath=new Employee("HoDMathematics", 200000);
		 Employee hodComp=new Employee("HoDComputerSci", 200000);
		 
		 vpsci.add(hodPhys);
		 vpsci.add(hodChem);
		 vpsci.add(hodMath);
		 vpsci.add(hodComp);
		 
		 System.out.println("Total hiring cost of principal: \t\t"+princi.getSalaries() + "\n");
		 System.out.println("Total hiring cost of Viceprincipal(Arts): \t"+vparts.getSalaries() + "\n");
		 System.out.println("Total hiring cost of Viceprincipal(Sci): \t"+vpsci.getSalaries() + "\n");
	 }
}
