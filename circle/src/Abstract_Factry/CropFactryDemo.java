package Abstract_Factry;

import java.util.Scanner;

public class CropFactryDemo {
	
 public static void main(String args[])
 {   
	 CropSeason cs= null;
	 int ans=0;
	 Scanner in=new Scanner(System.in);
	 do{
		 System.out.println("Plz enter the cropSeason ( Kharif / Rabi / Waigani ) ......");
		 String res= in.nextLine();
	 switch(res)
	 {
	 case "Kharif": cs=CropFactry.getCropSeason(res); ans++; break;
	 case "Rabi": cs=CropFactry.getCropSeason(res);  ans++;  break;
	 case "Waigani": cs=CropFactry.getCropSeason(res); ans++; break;
	 default: System.out.println("Invalid option!!!"); break;
	 }
	 }while(ans!=1);
	 in.close();
	Crop comCrp=cs.getCommercialCrop();
	Crop plntnCrp=cs.getPlanatationCrop();
	Crop fieldCrp=cs.getFieldCrop();
	
	System.out.println("The Plantation crop in the " + cs.getSeason() + " season is " + plntnCrp.getCrop());
	System.out.println("The Commercial crop in the " + cs.getSeason() + " season is " + comCrp.getCrop());
	System.out.println("The field crop in the " + cs.getSeason() + " season is " +  fieldCrp.getCrop());
 }
}
