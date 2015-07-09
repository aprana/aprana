package factory_singleton;

public class FS_Phd extends FS_member {
	public FS_Phd(String surname,String qualification){
		this.surname=surname;
		this.qualification=qualification;
		this.surname=surname;
		this.designation="Dr.*";
		
		
	}

	@Override
	public String getDesignation() {
		// TODO Auto-generated method stub
		return designation;
	}


}
