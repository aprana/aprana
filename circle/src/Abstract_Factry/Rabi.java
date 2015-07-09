package Abstract_Factry;

public class Rabi extends CropSeason{

	@Override
	public Crop getPlanatationCrop() {
		return (new Crop("Mustard"));
	}

	@Override
	public Crop getCommercialCrop() {
		return (new Crop("Tea"));
	}

	@Override
	public Crop getFieldCrop() {
		return (new Crop("Wheat"));
	}

	@Override
	public String getSeason() {
		return "Rabi";
	}
	

}
