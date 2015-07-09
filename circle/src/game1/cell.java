package game1;

public class cell {
	int status;
	int alivecount;
	
	cell(int st)
	{
		status = st;
		alivecount = 0;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	

}
