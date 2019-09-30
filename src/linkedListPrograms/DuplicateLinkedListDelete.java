package linkedListPrograms;

//find duplicates and delete it.
import javax.xml.soap.Node;

public class DuplicateLinkedListDelete {
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(int d) {
		// TODO Auto-generated method stub
		Node n = new Node(d);
		n.next = head;
		head = n;
	}

	public void removeDuplicates() {
		// TODO Auto-generated method stub
		Node curr = head;
		while (curr != null) {
			Node temp = curr;
			while (temp != null && temp.data == curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
			
		}
	}

	public void PrintLine() {
		// TODO Auto-generated method stub
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateLinkedListDelete l1 = new DuplicateLinkedListDelete();
		l1.push(20);
		l1.push(13);
		l1.push(13);
		l1.push(11);
		l1.push(11);
		l1.push(11);
		System.out.println("before remove duplicates");
		l1.PrintLine();

		l1.removeDuplicates();
		System.out.println("after remove duplicates");
		l1.PrintLine();
	}
}
