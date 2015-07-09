package test1;

public class Students {
	public int rollno;
	String course;
	
	Students(){
		rollno=0;
		course=null;	
	}
	
	
	Students(int n,String c){
		this.rollno=n;
		this.course=c;	
	}
	
	void setvalues(int n,String c){
		this.rollno=n;
		this.course=c;
		
	}

	
	int getrollno(){
		return this.rollno;
	}
	

	String getcourse(){
		return this.course;
		
}

	
}