import java.time.*;
import java.time.format.*;
import java.util.*;

public class LocalDateDemo1
{
	public static void main(String... arg)
	{
		//MonthDay dec25 = MonthDay.of(Month.DECEMBER,25);
		MonthDay dec25 = MonthDay.of(Month.FEBRUARY,15);
		//MonthDay dec25 = MonthDay.of(Month.APRIL,24);
		
		Year year = Year.now();
		for(int i=1; i<=5; i++)
		{
			LocalDate ld1 = year.plusYears(i).atMonthDay(dec25);
			
			int yn = ld1.getYear();
			String weekDay = ld1.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.getDefault());
			System.out.printf(" Birthday in %d is on %s %n " , yn,weekDay);
		}
	}
}