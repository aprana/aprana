package singleton;

public class Classsingleton {
			   private static Classsingleton instance = null;
		   protected Classsingleton() {
		      // Exists only to defeat instantiation.
		   }
		   public static Classsingleton getInstance() {
		      if(instance == null) {
		         instance = new Classsingleton();
		      }
		      return instance;
		   }
		

}
