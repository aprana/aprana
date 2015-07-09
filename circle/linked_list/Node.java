package linked_list;

public class Node<type> {
 type value;
 Node next;
 
 
 
 
public Node() {}


public Node(type value) {
	
	this.value = value;
	this.next = null;

}
public Node(type value, Node next) {
	this.value = value;
	this.next = next;
}
public type getValue() {
	return value;
}
public void setValue(type value) {
	this.value = value;
}
public Node getNext() {
	return next;
}
public void setNext(Node next) {
	this.next = next;
}


public void print(){
	
	System.out.println(" "+ value + " ");
	
}
	
	

}
