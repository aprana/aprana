package chain_of_resposibilty;

public class Secretory extends Approver {
	
	public void sanctionMoney(Purchase p)
	{
		if(p.getAmount()<=100000)
		{
			System.out.println("Secetory Approve for purchase number is  " +p.purchaseNo);
		}
	
	else 
	{
		System.out.println("Secetory cannot approve for purchase, purchase number is   ");
		 sucessor.sanctionMoney(p);
	}
	
	}

	
}