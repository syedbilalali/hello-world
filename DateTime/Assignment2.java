import java.util.*;
import java.time.*;
public class Assignment2
{
	public static void main(String... arg)
	{
		System.out.print(" Enter Date of Birth ( YYYY MM DD )-: ");
		Scanner sc = new  Scanner(System.in);
		int byear = sc.nextInt();
		int bmonth = sc.nextInt();
		int bday = sc.nextInt();
		
		LocalDate birthdate = LocalDate.of(byear , bmonth , bday);
		System.out.println(" Your BirthDate is -: " + birthdate);
		System.out.println(" Your Bithday Day -:" + birthdate.getDayOfWeek());
		
		for(int i=byear; i<=Year.now().getValue(); i++)
		{
			LocalDate pastyears =  LocalDate.of(i,bmonth,bday);
			System.out.println(" In " + pastyears.getYear()+ " year at Birthday Day " + pastyears.getDayOfWeek());
		}
	}
}