package basicprograms;

//duplicate element in arraylist
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class dupliArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<>();
		name.add("ravi");
		name.add("rohi");
		name.add("munna");
		name.add("rohit");
		name.add("ravi");
		name.add("rohi");

		Set<String> s = new HashSet<>();

		for (String name1 : name) {
			if (s.add(name1) == false)
				System.out.println(name1);
		}
	}
}
