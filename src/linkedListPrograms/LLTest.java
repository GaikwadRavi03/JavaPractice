package linkedListPrograms;

class Node {
	private int data;
	private Node next;

	public Node() {
		data = 0;
		next = null;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

class LinkedList {
	private int size;
	private Node start;

	public LinkedList() {
		size = 0;
		start = null;
	}

	public boolean isEmpty() { // isEmpty.
		if (start == null)
			return true;
		else
			return false;
	}

	public int getListSize() { // get list size.
		return size;
	}

	public void printList() { // print list.
		Node temp = start;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
	}

	public void insertAtFirst(int val) {
		Node n = new Node();
		n.setData(val);
		n.setNext(start);
		start = n;
		size++;
	}

	public void insertAtLast(int val) {
		Node n = new Node();
		n.setData(val);
		Node temp = start;
		if (temp == null) {
			start = n;
		} else {
			while (temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(n);
		}
		size++;
	}

	public void insertAtPosition(int index, int val) {
		if (index == 1)
			insertAtFirst(val);
		else if (index == size + 1)
			insertAtLast(val);
		else if (index > 1 && index <= size) {
			Node n = new Node(val, null);
			Node temp = start;
			for (int i = 1; i < index - 1; i++)
				temp = temp.getNext();
			n.setNext(temp.getNext());
			temp.setNext(n);
			size++;
		} else
			System.out.println("insertion not posiible at position" + index);
	}

	public void DeleteFirst() {
		if (start == null)
			System.out.println("list is already empty:");
		else {
			start = start.getNext();
			size--;
		}
	}

	public void DeleteLast() {
		if (start == null)
			System.out.println("list is already empty:");
		else if (size == 1) {
			start = null;
			size--;
		} else {
			Node temp = start;
			for (int i = 1; i < size - 1; i++)
				temp = temp.getNext();
			temp.setNext(null);
			size--;
		}
	}

	public void DeleteAtPosition(int index) {
		if (start == null)
			System.out.println("list is already empty");
		else if (index < 1 || index > size)
			System.out.println("Invalid index");
		else if (index == 1)
			DeleteFirst();
		else if (index == size)
			DeleteLast();
		else {
			Node temp = start;
			for (int i = 1; i < index - 1; i++) {
				temp = temp.getNext();
			}
			Node temp2 = temp.getNext();
			temp.setNext(temp2.getNext());
			size--;
		}
	}

}

public class LLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		l1.insertAtFirst(4);
		l1.insertAtFirst(3);
		l1.insertAtFirst(2);
		l1.insertAtFirst(1);
		l1.insertAtLast(8);
		l1.insertAtLast(9);
		l1.insertAtLast(10);
		l1.insertAtPosition(5, 5);
		l1.insertAtPosition(6, 6);
		l1.insertAtPosition(7, 7);
		l1.printList();
		l1.DeleteFirst();
		l1.DeleteLast();
		l1.DeleteAtPosition(5);
		System.out.println();
		l1.printList();
	}

}
