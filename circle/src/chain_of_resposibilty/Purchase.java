package chain_of_resposibilty;

public class Purchase {
	
	double amount;
	int purchaseNo;
	
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getPurchaseNo() {
		return purchaseNo;
	}
	public void setPurchaseNo(int purchaseNo) {
		this.purchaseNo = purchaseNo;
	}

	public Purchase(double amt,int puNo){
		this.amount=amt;
		this.purchaseNo=puNo;
		
	}
}
