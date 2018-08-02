import java.time.Year;
public class YearDemo
{
	public static void main(String... arg)
	{
		Year y1 = Year.of(2016);
		System.out.println(" Last Year : " + y1);
		
		Year y2 = y1.minusYears(1);
		System.out.println(" After Minus Last Year into One (2016 - 1): " + y2);
		
		Year y3 = y2.plusYears(1);
		System.out.println(" After Adding Last Year into One (2015 + 1): " + y3);
		
		Year y4 = Year.now();
		System.out.println(" Now Year : " + y4);
		
		if(y4.isLeap())
		{
			System.out.println(" " + y4 + " is Leap Year");
			
		}
		else
		{
			System.out.println(" " + y4 + " is not Leap Year");
		}
		
		
		
	}
}