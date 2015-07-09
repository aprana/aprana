package test2;
public class Main_Phone {

	public static void main(String[] args) {
		Phone_Type p[] = new Phone_Type[5];// Passes Model Type and id
		p[1] = new Phone_Type(3015,"Basic Phone");
		
		p[0] = new Phone_Type(5501,"Smart Phone");
        
		p[2] = new Phone_Type(3015,"Basic Phone");
        
        for(int i=0;i<=2;i++){
        	p[i].check_utilities();
        }
        	
	}
		


}
