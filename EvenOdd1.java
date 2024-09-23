import java.util.Scanner;
class EvenOdd1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		String even = "";
		String odd = "";

		for(int i=num;i>0;i/=10)
		{
			int rem = i%10;
			System.out.println(rem+"it is a rem");
			if(rem%2==0){
				even = rem + even ;
				System.out.println(even+"it si even");
			}
			else {
				odd = rem+odd;
				System.out.println(odd+"it is odd");
			}
		}
		System.out.println(odd+even+"it is a odd even");	
	}
}