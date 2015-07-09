package tax_adaptor_object;

public class GovtTC {
	
	public float govt_tax_calculate(float amt){
		float tax=20;
		tax=((tax/100)*amt);
		return tax;
	}

	
}

