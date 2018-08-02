import java.text.DateFormat;
import java.util.Date;

public class DateFormateClass
{
	public static void main(String... arg)
	{
		Date d1 = new Date();
		DateFormat[] dfa = new DateFormat[6];
		dfa[0] = DateFormat.getInstance();
		dfa[1] = DateFormat.getDateInstance();
		dfa[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfa[3] = DateFormat.getDateInstance(DateFormat.LONG);
		dfa[4] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
        
		for(int i=0; i<dfa.length; i++)
		{
			System.out.println(dfa[i].format(d1));
		}
	}
}