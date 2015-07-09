package genericList;



public class List<type> {
 Node first;
 

public List() {
this.first=null;
 }

public List(Node first) {
	this.first = first;
}

public  void createList(type value){
	
	Node newnode=new Node(value);
	
		first=newnode;
	}


public void addToTail(type value){
	Node newnode=new Node(value) ;
	
	Node temp=first;
	
	while(temp.next!=null){
		temp=temp.next;
		
	}
	temp.next=newnode;
	
	
	
	
}


public void addToHead(type value){
 if(first==null){
	 createList(value);
 }
 else{
		Node newnode=new Node(value,first);
		first=newnode;
 }
	
}


public void printList(){
	Node temp=first;
	
	System.out.println("List contents");
	while(temp!=null){
		
temp.print();
temp=temp.next;
}
}	
	
	public void insertAt(int position,type value){
		int count=0;
		int flag=0;
		Node temp=first;
		while(temp.next!=null){
			count++;
			
			if(position==1){
				addToHead(value);
				flag=1;
                System.out.println("Node inserted at position " + position);

				break;
			}
			else
			if(count==(position-1)){
				Node newnode=new Node(value) ;
                 newnode.next=temp.next;
                 temp.next=newnode;
                flag=1;
                System.out.println("Node inserted at position " + position);
                 break;
							
			}

				temp=temp.next;
			
		}
		if(position==(count+2)&& flag!=1){
            System.out.println("Node inserted at position " + position);
			addToTail(value);
		}
		else
		if(position>=(count+3)){
System.out.println("Position specified is more than the list length");		
}

		
		}
	
	
	public void deleteNode(type value){
		Node temp=first;
		int flag=0;
		while(temp.next!=null){
			if(temp.value==value){
				first=temp.next;
				flag=1;
                System.out.println("Deleted node of value" + value);

				break;
			}
			if(temp.next.value==value){
             temp.next=temp.next.next;
             flag=1;
             System.out.println("Deleted node of value" + value);

             break;
			}
			
			temp=temp.next;

		}
		if(flag==0)
			System.out.println(" Node with Value " + value +" does not exist");
		
		
	}
		
		
	}
	
	
	

	




