import java.time.LocalDate;
public class PlusMethod
{
	public static void main(String... arg)
	{
		LocalDate ld1 = LocalDate.of(2016,9,12);
		
		System.out.println("Now Date -: " + ld1);
		
		LocalDate ld2 = ld1.plusDays(5);
		System.out.println(" After Adding Days in Date -: " + ld2);
		
		LocalDate ld3 = ld1.plusMonths(7);
		System.out.println(" After Adding Months in Date -: " + ld3);
		
		LocalDate ld4 = ld1.plusWeeks(7);
		System.out.println(" After Adding Weeks in Date -: " + ld4);
		
		//Making Date from info Year and Number of Days

		LocalDate ld5 = LocalDate.ofYearDay(2016 , 39);
		
		System.out.println(" Making Date is adding Days 39 from 2016-01-01 -:" + ld5);
		
		
		
	}
}