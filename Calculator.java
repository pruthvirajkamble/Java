import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		outerloop:
		for(; ;){
			System.out.println();
			System.out.println("*** CALCULATOR ***");
			System.out.println();
			System.out.print("Enter operand1 : ");
			double operand1 = sc.nextDouble();
			System.out.print("Enter operand2 : ");
			double operand2 = sc.nextDouble();
			System.out.println("Enter an operator : ");
			char operator = sc.next().charAt(0);
			double output = 0;
			switch(operator)
			{
				case '+' : output = operand1 + operand2 ; break;
				case '-' : output = operand1 - operand2 ; break;
				case '*' : output = operand1 * operand2 ; break;
				case '/' : output = operand1 / operand2 ; break;
				case '%' : output = operand1 % operand2 ; break;
				case '#' : break outerloop;
				default : System.out.println("Wrong operator "); break;
			}
			System.out.println("Output is :" + output);
		}
	}
}
