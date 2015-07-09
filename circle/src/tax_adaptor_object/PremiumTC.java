package tax_adaptor_object;



public class PremiumTC implements TaxCalc {
	
	public float tax_calculate(float amt){
		float tax=10;
		tax=((tax/100)*amt);
		return tax;
	}

}
