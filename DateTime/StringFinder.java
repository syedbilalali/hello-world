/*
		DATE : 23/01/2018
		CREATED BY -: SYED BILAL ALI
		
		Topic -: Find String into another string.
		
*/
public class StringFinder{
	
	public static String getSubString(String str , int upperBound , int lowerBound){
		
		char[] st = str.toCharArray();
		int a=0;
		String str = "";
		char[] newchar = new char[lowerBound - upperBound];
		if(upperBound > -1 && lowerBound < st.length+1){
			
			while(upperBound != lowerBound){
				  
				  newchar[a] = st[upperBound];
				  a++;
				  upperBound++;
				 
			}
			str = new String(newchar);
			a=0;
		}
		return str.trim();
		
	}
	public static void main(String... arg){
		
		System.out.println("Hello World I am Syed Bilal Ali. I have Compeleted BCA from CSJM University. I want to be a Good Programmer ");
		System.out.println("But I have no skill to become good programmer. Because I have lack of Math in 12th std ");
		System.out.println("But I am ");
		
	}
}