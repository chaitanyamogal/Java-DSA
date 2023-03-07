package LinkedList;

public class LinkList {

	class Node {
		int value;
		Node next;

		public Node(int data) {
			this.value = data;
			this.next = null;
		}

	}

	public Node head = null;
	public Node tail = null;

	public void insertElementLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void insertElementFirst(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void insertAtIndex(int index, int value) {
		Node node1 = new Node(value);
		int size = 0;
		Node temp = head;
		while (size != (index - 1)) {
			temp = temp.next;
			size++;
		}
		Node temp1 = new Node(0);
		temp1.next = temp.next;
		temp.next = node1;
		node1.next = temp1.next;

	}

	public void deleteLastElement() {
		Node temp = head;
		if (temp.next != null) {
			temp.next = null;
		}
		while ((temp.next).next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}
	
	public void deleteAtIndex(int index) {
		Node tempHead = head;
		
		for(int i = 0; i < (index - 1); i++) {
			tempHead = tempHead.next;
		}
		tempHead.next = tempHead.next.next;
	}
	

	public void display() {

		Node temp = head;

		if (temp.next == null) {
			System.out.println("List is empty");
		}

		while (temp.next != null) {
			System.out.print(temp.value + "-->");
			temp = temp.next;
		}
		System.out.println(temp.value);

	}

	public static void main(String args[]) {
		LinkList list = new LinkList();

		list.insertElementLast(2);
		list.insertElementLast(8);
		list.insertElementLast(3);
		list.insertElementLast(7);
		list.insertElementLast(14);
		list.insertElementLast(1);
		list.insertElementLast(9);

		list.display();
		// list.deleteLastElement();
		list.insertAtIndex(5, 6);
		list.display();
		list.deleteAtIndex(1);
		list.display();
	}
}
