package plutoclassexamples;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample1 {

	public static void main(String[] args) {
		
    generateFutureDate(5,"MMM/dd/YYYY");
		
	}
	
	public static String generateFutureDate(int n,String Format)
	{
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, n);
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(Format);
		String formattedDate = sdf.format(d);
		System.out.println("FormattedDate" +formattedDate);
		
		String dateArr[] = formattedDate.split("/");
		System.out.println(dateArr[0]);
		System.out.println(dateArr[1]);
		System.out.println(dateArr[2]);
		return formattedDate;
	}
}

