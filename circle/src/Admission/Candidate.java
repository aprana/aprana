package Admission;

public class Candidate {
	
		int id;
		int marks;
		List preference;
		String collage;
		public Candidate(int id, int marks) {
			this.id = id;
			this.marks = marks;
		}

		public Candidate(int id, int marks, String preference1) {
			super();
			this.id = id;
			this.marks = marks;
			this.preference.preference[0] = preference1;

		}
		public Candidate(int id, int marks, String a[]) {
			super();
			this.id = id;
			this.marks = marks;
			
			this.preference=new List(a);
			//this.preference.preference[1] = preference2;

		}

		public void setCollege(String name){
			
			this.collage=name;
		}

		public String getPreference() {
			return preference.getPreference();
		}

		public void setPreference(List preference) {
			this.preference = preference;
		}

		}



