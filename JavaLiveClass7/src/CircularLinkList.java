

public class CircularLinkList {
	 class Node{
		 int data;
		 Node next;
		 
		 public Node(int data) {
			 this.data = data;
			 this.next = null;
		 }
	 }
 
	 public Node head = null;
	 //public Node tail = null;
	 
	 public void addNode(int data) {
		 // create a new node
		 Node newNode = new Node(data);
		 
		 // check if the list empty
		 if (head == null)
		 {
			 head = newNode;
			 //tail = newNode ; 
		 } else
			 
		 {
			 
			 
			 //tail.next = newNode ;
			 //tail = newNode;
			 
				Node tail  = head;
			// tail = head;
			 while (tail.next != null)
			 {
				 tail = tail.next;
			 }
			 tail.next = newNode ;
			 
			 		 
		 }
	 }
	 
	 public void addLastNode(int data) {
		 // create a new node
		 Node newNode = new Node(data);
		 
		 // check if the list empty
		 if (head == null)
		 {
			 head = newNode;
			// tail = newNode ; 
		 } else
			 
		 {		 
			 //tail.next = newNode ;
			 //tail = newNode;
			 
			 Node tail = head;
			 while (tail.next != null)
			 {
				 tail = tail.next;
			 }
			 tail.next = newNode ;
			 newNode.next = head;
			 		 
		 }
	 }
	 
	 public void display () {
		 Node current = head ;
		
		 if(head == null) {
			 System.out.println("List is empty");
			 return;
		 }
		 
		 System.out.println("Node of singly Circular list");
		 
		 Node temp = head ;
		do{
			 System.out.println( temp.data + " ");
			 //current = current.next;
			 temp = temp.next;
		 } while (temp != head) ;
		 
		 System.out.println();
	 }
	 
		public static void main(String[] args) {
			CircularLinkList test = new CircularLinkList();
			test.addNode(1);
			test.addNode(2);
			test.addLastNode(3);
			test.display ();
		}
 
}
