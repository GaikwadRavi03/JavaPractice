package basicprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDescString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		a1.add("E");
		System.out.println("list is:" + a1);
		Comparator<String> c1 = Collections.reverseOrder();
		Collections.sort(a1, c1);
		System.out.println("list is:" + a1);
	}

}
