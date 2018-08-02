import java.util.*;
public class CurrentDate
{
	public static void main(String... arg)
	{
		Date today = new Date(); //Default Constructor
		// Date today1 = new Date("05/12/2014 18:30:45");
		// Date today2 = new Date(5,12,2014,18,30,45);
		
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(today);
		
		System.out.println(" Today : " + today.toString());
		
		displayDateInfo(cal);
		cal.clear();
		
	}
	static void displayDateInfo(GregorianCalendar cal)
	{
		String days[] ={ "" , "Sun" , "Mon" , "Tue" , "Wed" , "Thu" , "Fri" , "Sat"};
		String months[]={"January" ,"Febuary" , "March" , "April" ,"May" ,"June" , "July" , "August","September","October" ,"November",
		"December"};
		String am_pm[] ={"AM" ,"PM"};
		System.out.println("Year : " + cal.get(Calendar.YEAR));
		System.out.println("Month : " + months[cal.get(Calendar.MONTH)]);
		System.out.println("Day : " + cal.get(Calendar.DATE));
		System.out.println("Day of Week : " + days[cal.get(Calendar.DAY_OF_WEEK)]);
		System.out.println("Hour : " + cal.get(Calendar.HOUR));
		System.out.println("Minute : " + cal.get(Calendar.MINUTE));
		System.out.println("Minute : " + cal.get(Calendar.SECOND));
		System.out.println("Minute : " + am_pm[cal.get(Calendar.AM_PM)]);
		
		TimeZone tz = cal.getTimeZone();
		System.out.println(" Time Zone -: " +  tz.getID());
		
		
		
	}
}