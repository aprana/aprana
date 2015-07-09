package tax_adaptor_class;

public abstract class Tax_adaptor_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalc tc;
		float amt=200000;
		if (amt<50000)
		{
			tc=new SimpleTC();
			
		}
		else if (amt>=500000 && amt<1000000)
		{
			tc=new PremiumTC();
		
		}
		else {
			tc=new GovtTCadapter();			
			
		}
		
		System.out.println("The amount is"+tc.tax_calculate(amt));
	}


}
