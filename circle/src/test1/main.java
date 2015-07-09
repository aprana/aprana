
package test1;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students s[]=new Students[3];
		s[0]=new Students(1320,"FineArts");
		s[1]=new Students(1358,"Theatre");
		
		Students m;
		int l=0;
		while(s[l]!=null){
			m=s[l++];
		}
		
		int i;
		System.out.println("l is"+l);
		
		for(i=0;i<l;i++){
			if(s[i].course=="FineArts")
			System.out.print(s[i].rollno+ "." +s[i].course+".I am  Sketching. I am painting.\n" );
			else
				System.out.print(s[i].rollno+"." +s[i].course+".I am Singing. I am Dancing. I am Acting." );
				
			}
				
		}
		
		
		
		
	}


