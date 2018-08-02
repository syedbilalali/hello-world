import java.text.SimpleDateFormat;
import java.util.Date;
public class MyDateFormatter
{
	public static void main(String... arg)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyy.MM.dd G 'at' HH:mm:SS: z ");
		System.out.println(" Formate 1 [ yyy.MM.dd G 'at' HH:mm:SS:  z ] -: " + sdf.format(new Date()));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("hh 'o''clock' a, zzzz");
		System.out.println(" Formate 2 [ hh 'o''clock' a, zzzz ] -: " + sdf1.format(new Date()));
		
	}
	/*
	   Simple DateFormat  Format Codes :-
	   
	   To specify the time format use a time pattern string. In this pattern all ASCII letters 
	   are represents pattern which are define as the following.
	   
	   Character                   Description                   Example
	   G        					Era Designator               AD
	   y							Year in Four Digits 		 2001
	   M 							Month in year				 July or 07
	   d 							Day in Month                 10
	   h							Hour in AM/PM(1-12)          12
	   H 							Hour in Day (0-23)			 22
	   m 							Minute in Hour               30
	   s							Second in Minute             55
	   S 							MilliSecond                  234
	   E                            Day in Week                  Tuesday
	   D                            Day in Year                  360
	   F                            Day of Week in Month         2(second Wed in July)
	   w							Week in Year 				 40
	   W							Week in Month				 1
	   a   							A.M/P.M Marker               PM
	   k							Hour in day(1~24)			 24
	   K							Hour in A.M/P.M(0~11)		 10
	   Z 							TimeZone Eastern StanderdTime
       '                            Escape for text              Delimeter
	   "                            Single Quote               
	   
	   
	
	*/
}