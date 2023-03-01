package LinkedList;


public class LinkList {
	
	class Node{
		int value;
		Node next;

		public Node(int data){
			this.value = data;
			this.next = null;
		}
		
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void insertElement(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}	
	}
	
	public void deleteLastElement() {
		Node temp = head;
		if(temp.next != null) {
			temp.next = null;
		}
		while( (temp.next).next != null)
		{
			temp = temp.next;
		}
		//System.out.println(temp.next.value);
		temp.next = null;
		}
	
	public void insertAtIndex(int index, int value) {
		Node node1 = new Node(value);
		int size = 0;
		Node temp = head;
		while(size != (index-1)) {
			temp = temp.next;
			size++;
		}
		Node temp1 = new Node(0);
		temp1.next= temp.next;
		temp.next = node1;
		node1.next = temp1.next;
			
	}
	
	public void display() {
		
		Node temp = head;
		
		if(temp.next == null) {
			System.out.println("List is empty");
		}
		
		while(temp.next != null) {
			System.out.print(temp.value);
			temp = temp.next;
		}
		System.out.println(temp.value);
		
	}
	
	
	public static void main(String args[]) {
		LinkList list = new LinkList();
		
		list.insertElement(2);
		list.insertElement(8);
		list.insertElement(3);
		list.insertElement(7);
		list.insertElement(14);
		list.insertElement(1);
		list.insertElement(9);
		
		list.display();
		//list.deleteLastElement();
		list.insertAtIndex(3, 6);
		list.display();
	}
}
