import java.util.Scanner;

class  CheckNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your number : ");
		int var = sc.nextInt();
		if(var>0){
			System.out.println("It is a Positive number : " + var);
			
		}
		else if(var==0){
			System.out.println("It is a neutral");
		}
		else{
			System.out.println(" It is a negative number : "+ var);
		}
		
	
	}
}
