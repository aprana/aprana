package Abstract_Factry;

public class Waigani extends CropSeason{

	@Override
	public Crop getPlanatationCrop() {
		return (new Crop("Sunflower"));
	}

	@Override
	public Crop getCommercialCrop() {
		return (new Crop("Coffee"));
	}

	@Override
	public Crop getFieldCrop() {
		return (new Crop("Maize"));
	}

	@Override
	public String getSeason() {
		return "Waigani";
	}
	

}
