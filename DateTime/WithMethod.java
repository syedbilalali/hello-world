import java.time.LocalDate;
import java.time.Month;

public class WithMethod
{
	public static void main(String... arg)
	{
		LocalDate ld1 = LocalDate.of(2016,Month.SEPTEMBER,12);
		
		System.out.println(" LocalDate class Date -: " + ld1);
		
		LocalDate ld2 = ld1.withYear(2017);
		System.out.println(" LocalDate class Date(withYear) -: " + ld2);
		
		LocalDate ld3 = ld1.withYear(2014).withMonth(7);
		System.out.println(" LocalDate class Date(withYear & withMonth) -: " + ld3);
		
		long days =  ld2.toEpochDay();
		System.out.println(" EpochDays counted from current ("+ld2.getYear()+") year : " +  days);
		
		LocalDate epochyear = LocalDate.ofEpochDay(days);
		System.out.println(" EpochYear Counted From EpochDays( "+ days +" )  : " +  epochyear);
		
		
	}
}