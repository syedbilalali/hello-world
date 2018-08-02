import java.time.LocalDate;
import java.time.Month;
public class MonthDemo
{
	public static void main(String... arg)
	{
		LocalDate ld1 = LocalDate.of(2016,Month.SEPTEMBER,12);
		System.out.println(" Date is -: " + ld1);
		
		Month mon1 = Month.from(ld1);
		System.out.println(" Month is -: " + mon1);
		
		Month mon2 = Month.of(2);
		System.out.println(" Month  of (digit) is -: " + mon2);
		
		Month mon3 = mon2.plus(2);
		System.out.println(" After Adding 2 in month -: " + mon3);
		
		Month mon4 = ld1.getMonth();
		System.out.println(" Get Month From Local Date -: " + mon4);
		
		int monthvalue = mon2.getValue();
		System.out.println(" Get Month Value in Int Type  -: " + monthvalue);
		
		
		
		
		
		
	}
}