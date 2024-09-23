import java.util.Scanner;
class PowerNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num : ");
		int num  = sc.nextInt();
		System.out.print("Enter the power ; ");
		int power = sc.nextInt();
		int op = 1;
		for(int i=1;i<=power;i++)
			op *= num;
		System.out.println("Power of "+ num+"^"+power+" is "+op); 

	}

}