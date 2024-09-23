import java.util.*;
class palindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String  str = sc.next();
		if(isPalindrome(str))
			System.out.println(str + " is palindrome");
		else 
			System.out.println(str + " is not palindrome");

	}
	public static boolean isPalindrome(String str) 
	{
		String rev = "";
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			rev = ch + rev;
		}
		if(rev.equals(str))
			return true;
		else 
			return false;
	}
}