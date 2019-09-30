package linkedListPrograms;

import linkedListPrograms.RevLLStack.Node;

//reverse linked list in single list.
public class ReverseLL {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void push(int d) {
		Node n = new Node(d);
		n.next = head;
		head = n;
	}

	public Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	public void printList(Node temp) {
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		ReverseLL l1 = new ReverseLL();
		l1.push(20);
		l1.push(40);
		l1.push(30);
		l1.push(50);
		System.out.println("Given Linked list");
		l1.printList(head);

		head = l1.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		l1.printList(head);
	}
}