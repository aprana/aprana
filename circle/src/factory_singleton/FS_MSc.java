package factory_singleton;

public class FS_MSc extends FS_member {
	public FS_MSc(String surname,String qualification){
		this.surname=surname;
		this.qualification=qualification;
		this.surname=surname;
		this.designation="Mr.*";
		
		
	}

	@Override
	public String getDesignation() {
		// TODO Auto-generated method stub
		return designation;
	}

}
