package basicprograms;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetCurrentDateAndTime {
	public static void main(String[] args) {
		int day, month, year;
		int sec, min, hour;
		GregorianCalendar date = new GregorianCalendar();
		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);

		sec = date.get(Calendar.SECOND);
		min = date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR);

		System.out.println("curr time is :" + hour + ":" + min + ":" + sec);
		System.out.println("curr date is :" + day + "/" + month + "/" + year);
	}
}
