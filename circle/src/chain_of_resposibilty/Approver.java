package chain_of_resposibilty;

public abstract class Approver {
	Approver sucessor;

	public void setSucessor(Approver sucessor) {
		this.sucessor = sucessor;
	}
	
	public abstract  void sanctionMoney(Purchase p);
	
}
