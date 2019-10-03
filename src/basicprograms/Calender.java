package basicprograms;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 10;
		int year = 2019;
		calenderPrint(month, year);
	}

	private static void calenderPrint(int month, int year) {
		// TODO Auto-generated method stub
		String[] s = { "january", "February", "March", "April", "may", "june", "July", "August", "Sepetember",
				"October", "November", "December" };
		int[][] arr = new int[6][7];
		int start = dayOfWeeks(month, 1, year);
		int fill = 1;
		int max = 0;
		if (month == 2) {
			boolean b = isLeapYear(year);
			if (b) {
				max = 29;
			} else {
				max = 28;
			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			max = 31;
		} else {
			max = 30;
		}
		outer: for (int i = 0; i < 6; i++) {
			for (int j = start; j < 7; j++) {
				if (fill <= max) {
					arr[i][j] = fill;
					fill++;
				} else {
					break outer;
				}
				start = 0;
			}
		}
		System.out.println(s[month - 1] + " " + year);
		System.out.println("S  M  T  W  T  F  S");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (arr[i][j] == 0) {
					System.out.print("   ");
				} else if (arr[i][j] > 9) {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print(arr[i][j] + "  ");
				}
			}
			System.out.println();
		}
	}

	private static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 == 0))
			return true;
		else
			return false;
	}

	private static int dayOfWeeks(int m, int d, int y) {
		// TODO Auto-generated method stub
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		return d0;
	}
}
