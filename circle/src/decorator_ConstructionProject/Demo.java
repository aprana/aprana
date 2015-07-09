package decorator_ConstructionProject;

public class Demo {

	public static void main(String[] args) {
		Shop s = new Shop("SHOP1","AAA");
		//s.display();
		
		Flat f=new Flat(2 , "FLAT","CCC");
			//f.display();
			
			Leaseable l=new Leaseable(f);
			l.leaseFlat("Rita");
			l.disaply();
	}

}
