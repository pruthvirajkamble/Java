import java.util.Scanner;
class CountOfDigit01
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num = sc.nextInt();
		int count = 0;
		int i = num;
		while(i>0){
			count++;
			i/=10;
		}
		System.out.println("Count of digit number : " + count);

	}
}