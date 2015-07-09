package tax_adaptor_object;



public class SimpleTC implements TaxCalc {
	
	public float tax_calculate(float amt){
		float tax=5;
		tax=((tax/100)*amt);
		return tax;
	}
}