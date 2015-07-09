package chain_of_resposibilty;

public class President extends Approver {
	
	public void sanctionMoney(Purchase p)
	{
		if(p.getAmount()<=600000)
		{
			System.out.println("President Approve for purchase , purchase number is   " +p.purchaseNo);
		}
	
		else 
		{
			System.out.println("President cannot approve for purchase , purchase number is   ");
			 sucessor.sanctionMoney(p);
		}
		
	}

	
	

}
