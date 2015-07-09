package tax_adaptor_object;


public class GovtTCadapter implements TaxCalc {
	GovtTC gtc;
	
	   public float tax_calculate(float amt){
		   gtc=new GovtTC();
		return gtc.govt_tax_calculate(amt);
		
	}

}
