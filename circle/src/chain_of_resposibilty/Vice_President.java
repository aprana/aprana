package chain_of_resposibilty;

public class Vice_President extends Approver {
	public void sanctionMoney(Purchase q)
	{
		if(q.getAmount()<=50000)
		{
			System.out.println("Vice-President Approve for purchase,purchase number is " +q.purchaseNo);
		}
	
	else 
	{
		System.out.println("Vice-President cannot approve for purchase");
		 sucessor.sanctionMoney(q);
	}
}

	

}


