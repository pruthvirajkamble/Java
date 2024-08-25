import java.util.Scanner;
class JoinArmy 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		System.out.print("Enter your Height : ");
		long height = sc.nextLong();
		System.out.print("Enter your Weight : ");
		double weight = sc.nextDouble();
		
		if(age>=18 && height>=162 && weight>=56){
			System.out.print("Yes, you can join Army");
		}else{
			System.out.print("Sorry, you can't join Army");
		}
	}
}
