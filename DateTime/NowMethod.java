import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
public class NowMethod
{
	public static void main(String... arg)
	{
		LocalDate ld1 = LocalDate.now();
		System.out.println(" Date is -: " + ld1);
		
		LocalTime ld2 = LocalTime.now();
		System.out.println(" Time is -: " + ld2);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(" DateTime -: " + dateTime);
		
		ZonedDateTime dataTimeWithZone = ZonedDateTime.now();
		System.out.println(" Zoned Date Time -: " + dataTimeWithZone);
		
	}
}