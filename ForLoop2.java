import java.util.Scanner;
class ForLoop2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++){
			if(num%i==0){
				System.out.println(i);
			}
		}
	}
}