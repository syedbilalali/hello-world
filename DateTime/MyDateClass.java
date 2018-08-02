import java.util.Date;
public class MyDateClass
{
	public static void main(String... arg)
	{
		Date d = new Date();
		System.out.println(" Today Date is -: " + d);
		System.out.println(" Current Date is -: " + d.getDate());
		System.out.println(" Current Day is -: " + d.getDay());
		System.out.println(" Current Year -: " + d.getYear());
		System.out.println(" Current Hour -: " + d.getHours());
		System.out.println(" Current Minutes -: " + d.getMinutes());
		System.out.println(" Current Seconds -: " + d.getSeconds());
		
	}
}