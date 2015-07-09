package Abstract_Factry;

public class Kharif extends CropSeason{

	@Override
	public Crop getPlanatationCrop() {
		return (new Crop("Groundnut"));
	}

	@Override
	public Crop getCommercialCrop() {
		return (new Crop("Sugarcane"));
	}

	@Override
	public Crop getFieldCrop() {
		return (new Crop("Rice"));
	}

	@Override
	public String getSeason() {
		return "Kharif";
	}
	

}
