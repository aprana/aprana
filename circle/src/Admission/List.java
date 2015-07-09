package Admission;

public class List {

		String [] preference;
		int next=0;
		public List(String[] preference) {
			this.preference = preference;
		}
		public String getPreference() {
		 String s;
		 if(next<preference.length){
		 s=preference[next];
		 next++;
		 }
		 else 
			 s=null;
			return s;
		}
		
		public String getNextPref(int i){
			next++;
			return preference[i];
		}
		
		
	}


