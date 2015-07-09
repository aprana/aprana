package diskAdaptorObject;

public class Adaptor_object_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Disk disk=new Disk();
		disk.display_output();
		
		Drive drive=new Adaptor();
		drive.send_output(disk, "test");		
	}

}
