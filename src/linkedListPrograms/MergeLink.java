package linkedListPrograms;

public class MergeLink {
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	private void push(int d) {
		// TODO Auto-generated method stub
		Node n1 = new Node(d);
		n1.next = head;
		head = n1;
	}

	private void merge(MergeLink LL) {
		Node n1 = head, n2 = LL.head;
		Node a_next, b_next;

		while (n1 != null && n2 != null) {
			a_next = n1.next;
			b_next = n2.next;

			n2.next = a_next;
			n1.next = n2;

			n1 = a_next;
			n2 = b_next;
		}
		LL.head = n2;
	}

	private void printLine() {
		// TODO Auto-generated method stub
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MergeLink l1 = new MergeLink();
		MergeLink l2 = new MergeLink();
		l1.push(11);
		l1.push(13);
		l1.push(17);
		l1.push(7);
		l1.push(5);
		System.out.println("first linked list: ");
		l1.printLine();

		l2.push(6);
		l2.push(4);
		l2.push(2);
		l2.push(10);
		l2.push(12);
		System.out.println("second linked list: ");
		l2.printLine();

		l1.merge(l2);
		System.out.println("modified 1st list");
		l1.printLine();
		System.out.println("modified 2nd list");
		l2.printLine();
	}
}