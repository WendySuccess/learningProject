
public class SinglyLinkedList {
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
	 
		 
	 public void display () {
		 Node current = head ;
		
		 if(head == null) {
			 System.out.println("List is empty");
			 return;
		 }
		 
		 System.out.println("Node of singly linked list");
		 
		 while (current!= null) {
			 System.out.println(current.data + " ");
			 current = current.next;
		 }
		 
		 System.out.println();
	 }
	 
		public static void main(String[] args) {
			SinglyLinkedList test = new SinglyLinkedList();
			test.addNode(1);
			test.addNode(2);
			test.display ();
		}
 
}
