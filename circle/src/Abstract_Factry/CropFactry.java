package Abstract_Factry;

public class CropFactry {
public static CropSeason getCropSeason(String season)
{
	if(season.equalsIgnoreCase("Kharif"))
	{
		return new Kharif();
	}
	else if(season.equalsIgnoreCase("Rabi"))
	{
		return new Rabi();
	}
	else
		return new Waigani();
}

}
