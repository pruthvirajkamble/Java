//import java.util.Scanner;
class LowerCaseRec
{   
	static char ch = 'a';
	public static void main(String[] args) {
		letterLower();
	}
	public static void letterLower()
	{
		System.out.println(ch++ + " ");
		if(ch == 'z')
			return;
		letterLower();

	}
}