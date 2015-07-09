package factorydesignpattern;

public class Phonemain {

	public static void main(String[] args) {
		Phonefactory pf=new Phonefactory();
		
		Phone p1=pf.getPhone("abc","Basicphone");
		Phone p2=pf.getPhone("xyz","Smartphone");
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		

	}

}
