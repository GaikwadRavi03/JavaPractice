package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
//		for (Integer integer : list) {
//			System.out.print(integer + " ");
//		}

//		list.forEach(System.out::print);

//		list.stream().filter(i->{
//			System.out.println("hi");
//			return true;
//		});
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime d1 = LocalDateTime.now();
		System.out.println(t);
	}
}
