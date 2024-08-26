package plutoclassexamples;

import java.util.Calendar;

public class DateExample {

	public static void main(String[] args) {
		
		generateFutureDate(20);
		
	}
	
	public static void generateFutureDate(int n)
	{
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, n);
		
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeZone());
		

	
	}

}
