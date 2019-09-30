package linkedListPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class SearchElementLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);

		System.out.println("index of 50 is: "+l1.indexOf(50)+"  \nfound ");
	}

}
