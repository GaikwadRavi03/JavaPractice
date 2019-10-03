package linkedListPrograms;

public class NegativePositiveMerge {

	public Node head;

	public NegativePositiveMerge() {
		head = null;
	}

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

	private void merge(NegativePositiveMerge LL) {
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
		// TODO Auto-generated method stub\
		NegativePositiveMerge l1 = new NegativePositiveMerge();

		int[] arr = { -3, 3, 1, -2, -1, 2 };

		int[] positive = new int[arr.length / 2];
		int[] negetive = new int[arr.length / 2];
		sort(arr);

		System.out.println("sorted Linked list desc order is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negetive[j] = arr[i];
				j++;
			} else {
				positive[i] = arr[i];
			}
		}

		for (int i = 0; i < negetive.length; i++) {
			l1.push(negetive[i]);
		}
		System.out.println("\n1st half linked list is:");
		l1.printLine();

		NegativePositiveMerge l2 = new NegativePositiveMerge();
		for (int i = 0; i < positive.length; i++) {
			l2.push(positive[i]);
		}
		System.out.println("2nd half linked list is:");
		l2.printLine();
		l1.merge(l2);
		System.out.println("merge list is:");
		l1.printLine();
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
