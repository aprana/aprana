package singleton;

public class Calander {
	 private static Calander instance = null;
	Calander(){
		
				
	}
	 public static Calander getInstance() {
	      if( instance== null) {
	         instance = new Calander();
	      }
	      return instance;
	   }
}
