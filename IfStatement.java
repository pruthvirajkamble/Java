import java.util.Scanner;
class IfStatement 
{
	public static void main(String[] args) 
	{
		//int a = 5;
		//int var1 = 10;
		Scanner var = new Scanner(System.in);
			int var1 = var.nextInt();
		if(var1%5==0 && var1%2!=0){
			System.out.println("HiFive");
		}
		if(var1%2==0 && var1%5!=0){
			System.out.println("hiTwo");
		}
		if(var1%5==0 && var1%2==0){
			System.out.println("HiFIveTwo");
		}
			
		//System.out.println("Hello World!");
	}
}
