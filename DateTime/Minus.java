import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
public class Minus{
	public static void main(String... arg)
	{
		LocalDate ld1 = LocalDate.of(2014, 6,21);
		LocalDate ld2 = ld1.minusMonths(5);
        
		System.out.println(" After Minus Month  -: " + ld2);
		
		LocalDate ld3 = ld2.minusWeeks(3);
		System.out.println(" After Minus Week -: " + ld3);
	}
}

