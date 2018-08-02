import java.time.LocalDate;
import java.time.LocalDateTime;
public class FromMethod
{
	public static void main(String... arg)
	{
		LocalDateTime ldt = LocalDateTime.of(2015,12,30,14,34);
		System.out.println(" DateTime -: " + ldt);
		
		LocalDate ld = LocalDate.from(ldt);
		System.out.println(" LocalDate -: " + ld);
	}
}