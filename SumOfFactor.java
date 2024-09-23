import java.util.Scanner;
class SumOfFactor{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num = sc.nextInt();
		int sum = 1;
		for(int i=1;i<=num;i++){
			if(i%2==0){
				sum = sum+i;
			}

		}
		System.out.print("Sum of facors is : "+ sum);
	}
}