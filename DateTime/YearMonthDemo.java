import java.time.Month;
import java.time.YearMonth;

public class YearMonthDemo
{
	public static void main(String... arg)
	{
		YearMonth ym = YearMonth.of(2016,Month.JANUARY);
		int monthlength = ym.lengthOfMonth();
		System.out.println(" Maximun Day in "+ ym.getMonth() + " : " + monthlength);
		
		int yearlength = ym.lengthOfYear();
		System.out.println(" Maximun Day in "+ ym.getYear() + " : " + yearlength);

	}
}