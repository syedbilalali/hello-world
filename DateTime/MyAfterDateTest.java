import java.util.Date;
public class MyAfterDateTest
{
	public static void main(String... arg)
	{
		Date current = new Date();
		
		long nextDay = System.currentTimeMillis() + 1000 * 60 * 60 * 24;
        
		Date nextDate = new Date(nextDay);
		
		long prevDay = System.currentTimeMillis() - 1000 * 60 * 60 * 24;
		Date prevDate = new Date(prevDay);
		
		if(nextDate.after(current))
		{
			System.out.println(" The Date is Future Day");
		}
		else
		{
			System.out.println(" The Date is Older Then Current Day");
		}
		if(prevDate.before(current))
		{
		   System.out.println(" The Date is Older The Current Day");
		}
	}
}