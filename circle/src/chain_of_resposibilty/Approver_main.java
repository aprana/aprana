package chain_of_resposibilty;

public class Approver_main {

	public static void main(String[] args) {
		Secretory s = new Secretory();
		Vice_President vp = new Vice_President();
		President P = new President();
		
		s.setSucessor(vp);
		vp.setSucessor(P);
		
		Purchase pr1 = new Purchase(150000,3);
		s.sanctionMoney(pr1);
		
		Purchase pr2 = new Purchase(170000,6);
		s.sanctionMoney(pr2);
		
		Purchase pr3 = new Purchase(350000,4);
		s.sanctionMoney(pr3);
		
		Purchase pr4 = new Purchase(150000,2);
		s.sanctionMoney(pr4);
		
		Purchase pr5 = new Purchase(80000,5);
		vp.sanctionMoney(pr5);
		
		Purchase pr6 = new Purchase(3400,1);
		vp.sanctionMoney(pr6);
		
		
		
	}

}
