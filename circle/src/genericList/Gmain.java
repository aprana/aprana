package genericList;

public class Gmain {

	

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	   List<Integer> l1=new List<Integer>();
	   
	   
	     l1.createList(5);
	     l1.addToTail(7);
	     l1.addToTail(8);
	  l1.addToHead(10);

	 // l1.printList();

	  l1.insertAt(4,12);

	  l1.deleteNode(8);
	  l1.printList();

		}

	}



