import java.time.*;
import java.util.Scanner;
import java.io.*;
public class Assignment1
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
		
	    LocalDate nowdate = LocalDate.now();
		System.out.println(" Now Date -: " + nowdate);
		
		Period leftDate = Period.between(birthdate , nowdate);
        System.out.println("Days -: " + leftDate.getDays());
        System.out.println("Months -: " + leftDate.getMonths());
        System.out.println("Years -: " + leftDate.getYears());
		
	    int totaldaysInt=0;
		for(int i=(byear + 1); i<=nowdate.getYear()-1; i++)
		{
			for(int j=1; j<=12; j++)
			{
				int tdays = YearMonth.of(i,j).lengthOfMonth();
				System.out.println(" In Month "+Month.of(j)+" In Year "+ i +" Days -:" + tdays);
                totaldaysInt += tdays;				
			}
		}
		System.out.println("Total Int Days -: " + totaldaysInt);
		int totalLower=0;
		for(int j=(bmonth + 1); j<=12; j++)
		{
			    int tldays = YearMonth.of(byear,j).lengthOfMonth();
				System.out.println(" In Month "+Month.of(j)+" In Year "+ bmonth +" Days -:" + tldays);
                totalLower += tldays;
		}
		System.out.println("Total Int Days -: " + totalLower);
		
	}
}