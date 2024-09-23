import java.util.Scanner;
class Factorial1
{
	static int i =1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		factors(num);

	}
	public static void factors(int num)
	{
		if(num%i==0){
			System.out.print(i+ " ");
		}
		i++;
		if(i==num+1)
		{
			return;
		}
		factors(num);
	}
}