import java.util.*;
class AddEven
{
	public static void main(String[] args) {
		int num = 3247365;
		int op = solve(num);
		System.out.println(op);
	}
	public static int solve(int num){
		int sum = 0;
		// for (int i=num;i>0 ;i/=100 ) {
		// 	int rem = num%10;
		// 	sum = sum + rem;

		// }
		while(num>0)
		{
			int rem = num%10;
			sum +=rem;
			num/=100;
		}
		return sum;
	}
}	
