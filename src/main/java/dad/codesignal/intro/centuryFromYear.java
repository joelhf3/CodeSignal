package dad.codesignal.intro;

public class centuryFromYear {

	
	public static int centuryFromYear(int year) {
		
		int num = year / 100;
		
		if(year % 100 > 0)
			return num+=1;
		else
			return num;
	}
	
	public static void main(String[] args) {
		
		int num = centuryFromYear(2000);
		System.out.println(num);
	}

}
