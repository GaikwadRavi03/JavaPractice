package linkedListPrograms;

public class FindMiddleLL {
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

	public void printMiddle() {
		Node slow = head;
		Node fast = head;
		if (head != null) {
			while (fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			System.out.println("The middle element is [" + slow.data + "] \n");
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
		FindMiddleLL l1 = new FindMiddleLL();
		l1.push(1);
		l1.push(2);
		l1.push(3);
		l1.push(4);
		l1.push(5);
		l1.PrintLine();
		l1.printMiddle();
	}
}
