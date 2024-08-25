import java.util.Scanner;

class Salary 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary : ");
		double sal = sc.nextDouble();
		System.out.println("Enter your score : ");
		int score = sc.nextInt();
		if((score>0 && score<100)){
			if(score>=90){
				System.out.println("Previous salary "+ sal);
				sal = sal+((sal/100)*3);
				System.out.println("Increment Salary by 3 % is "+ sal+"rs. ");
			}else{
				System.out.println("Previous salary "+sal);
				sal = sal+((sal/100)*1);
				System.out.println("Incremented Salary by 1% is "+ sal+"rs.");
				
			}
		}
		else{
			System.out.println("Do the cal..");
		}
	}
}
