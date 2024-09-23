import java.util.Scanner;
class PrimeNo1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num : ");
		int num = sc.nextInt();
		int fprime = 0;
		int nprime = 0;
		for(int i=2; ;i++)
		{   int num2 = i;
	        boolean flag = true;
			
			for(int j=2;j<num2;j++){

				if(i%j==0){
					flag = false;
				    break;
				}
			}
			if(flag)
			{
				if(num2<num){
					fprime = num2;
				}
				else if(num<i)
				{
					nprime = num2;
					break;
				}
			}   
		}
		if(num-fprime < nprime-num)
			System.out.print(fprime+" "+num);
		else if(num-fprime > nprime-num)
			System.out.print(num+" "+nprime);
		else 
			System.out.println(fprime + " "+num+" "+nprime);
	}
}