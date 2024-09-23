import java.util.Scanner;
class PrimeNo2
{
	static int i =2;
	static boolean flag = true;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		factors(num);
		if(flag)
			System.out.println(num+ " it is Prime");
		else 
			System.out.println(num+" it is not prime");
	}
	public static void factors(int num)
	{
		if(num<2)
			flag = false;
		    return;

		if(num%i==0){
			flag = false;
			return;
		}
		i++;
		if(i==num)
		{
			return;
		}
		factors(num);
	}
}