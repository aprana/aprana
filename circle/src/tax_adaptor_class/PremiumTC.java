package tax_adaptor_class;

public class PremiumTC implements TaxCalc {
	
	public float tax_calculate(float amt){
		float tax=10;
		tax=((tax/100)*amt);
		return tax;
	}

}
