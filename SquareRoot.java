import java.util.Scanner;
class SquareRoot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int sqrt = 0;
		for(int i=1;i<num/3;i++)
		{
			if(i*i==num){
				sqrt = i;
				break;
			}
		}
		if(sqrt != 0){
			System.out.println("SQRT of "+ num + " is :  " +sqrt);
		}
		else {
			System.out.println(num + " doesn't have a perfect sqrt");
		}
	}
}