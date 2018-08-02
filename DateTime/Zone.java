import java.time.*;
import java.util.*;
public class Zone
{
	public static void main(String... arg)
	{
		Set<String> zonelds = ZoneId.getAvailableZoneIds();
		TreeSet<String> ts = new TreeSet<>(zonelds);
		
		for(String str : ts)
		{
			System.out.println("Country Zone : " + str);
		}
	}
}