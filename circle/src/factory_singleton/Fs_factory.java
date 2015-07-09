package factory_singleton;


public class Fs_factory {
	


public static FS_member getFS_member(String surname,String qualification){
	if(qualification.equals("Phd"))
		return new FS_Phd(surname,qualification);
	else
		if(qualification.equals("Msc"))
			return new FS_MSc(surname,qualification);
		else return null;	
		
	
}
public static Fs_factory getInstance() {
	// TODO Auto-generated method stub
	return null;
}
}