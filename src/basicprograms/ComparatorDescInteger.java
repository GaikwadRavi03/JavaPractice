package basicprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDescInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(50);
		a1.add(30);
		a1.add(20);
		a1.add(40);
		a1.add(60);
		System.out.println("list is:" + a1);
		Comparator<Integer> c1 = Collections.reverseOrder();
		Collections.sort(a1, c1);
		System.out.println("list is:" + a1);
	}
}
