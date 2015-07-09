package tax_adaptor_class;

public class GovtTC {
	
	public float govt_tax_calculate(float amt){
		float tax=20;
		tax=((tax/100)*amt);
		return tax;
	}

	
}
