package linkedListPrograms;

public class DetectLinkedList {
	static Node head;

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

	private void printList() {
		// TODO Auto-generated method stub
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public int detectAndRemoveLoop(Node node) {
		Node slow = node, fast = node;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			// If slow and fast meet at same point then loop is present
			if (slow == fast) {
				removeLoop(slow, node);
				return 1;
			}
		}
		return 0;
	}

	public void removeLoop(Node loop, Node curr) {
		Node ptr1 = null, ptr2 = null;
		ptr1 = curr;
		while (1 == 1) {
			ptr2 = loop;
			while (ptr2.next != loop && ptr2.next != ptr1) {
				ptr2 = ptr2.next;
			}
			if (ptr2.next == ptr1) {
				break;
			}
			ptr1 = ptr1.next;
		}
		ptr2.next = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectLinkedList list = new DetectLinkedList();
//		list.head = new Node(50);
//		list.head.next = new Node(20);
//		list.head.next.next = new Node(15);
//		list.head.next.next.next = new Node(4);
//		list.head.next.next.next.next = new Node(10);

		list.push(50);
		list.push(40);
		list.push(30);
		list.push(20);
		list.push(10);

		// Creating a loop for testing
		head.next.next.next.next.next = head.next.next;
		list.detectAndRemoveLoop(head);
		System.out.println("Linked List after removing loop : ");
		list.printList();
	}
}
