import java.util.Date;
public class CurrentDateTime
{
	public static void main(String... arg)
	{
		Date d = new Date();
		String s = d.toString();
		System.out.println(" Date -: " + s);
	}
}