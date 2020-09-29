package dad.codesignal.intro;

public class checkPalindrome {

	public static boolean checkPalindrome(String inputString) {

		return (inputString.equals(new StringBuilder(inputString).reverse().toString()));
		
	}

	
	public static void main(String[] args) {

		boolean str = checkPalindrome("abba");
		System.out.println(str);
		
	}

}
