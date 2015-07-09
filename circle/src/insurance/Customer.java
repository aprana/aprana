package insurance;

public class Customer {
	
	String c_name;
	String c_address;
	int mb_no;
	int login_id;
	String password;
	Policy p;
	
	
	public int getLogin_id() {
		return login_id;
	}
	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}
	Payment pay;
	
	
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_address() {
		return c_address;
	}
	public void setC_address(String c_address) {
		this.c_address = c_address;
	}
	public int getMb_no() {
		return mb_no;
	}
	public void setMb_no(int mb_no) {
		this.mb_no = mb_no;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	boolean log_in(int login,String password ){
		if( this.password==password && login_id== login_id){
			return false;
		}
		return true;
		}
	}
	
	
	



