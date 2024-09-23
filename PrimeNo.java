import java.util.Scanner;
class PrimeNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number : ");
		int num = sc.nextInt();
		for (int i=2;i<=num/2 ;i++ ) 
		{
			if((num%i)==0){
				System.out.println("It is not prime");
				break;
			}
			if(i==num){
				System.out.print("It is prime");
			}
			else{
				System.out.print("It is not prime");
			}	
		}
	}	
}