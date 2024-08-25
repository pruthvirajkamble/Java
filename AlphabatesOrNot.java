import java.util.Scanner;

class AlphabatesOrNot 
{
	public static void main(String[] args) 
	{
		Scanner var = new Scanner(System.in);
		System.out.println("Enter the Alphabates: ");
		char ch = var.next().charAt(0);
		System.out.print((ch>=65 && ch<=90 || ch>=97 && ch<=122)? (ch+" It is a alphabate") : (ch + " It is not a aplhabate"));
	}
}
