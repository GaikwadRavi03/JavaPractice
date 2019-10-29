package linkedListPrograms;

//Reverse linked list using stack.
import java.util.Stack;

public class RevLLStack {
	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void push(int d) {
		Node n1 = new Node(d);
		n1.next = head;
		head = n1;
	}

	public static void PrintList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	private static Node reverse(Node head) {
		Stack<Node> stk = new Stack<Node>();
		// Push the elements of list to stack
		Node temp = head;
		while (temp.next != null) {
			stk.push(temp);
			temp = temp.next;
		}
		head = temp;
		while (!stk.isEmpty()) {
			temp.next = stk.peek();
			temp = temp.next;
			stk.pop();
		}
		temp.next = null;
		
		return head;
	}

	public static void main(String[] args) {
		push(5);
		push(4);
		push(3);
		push(2);
		push(1);
		System.out.println("linked list is: ");
		PrintList();
		head = reverse(head);
		System.out.println();
		System.out.println("rev linked list is: ");
		PrintList();
	}
}
