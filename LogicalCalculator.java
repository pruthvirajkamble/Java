import java.util.Scanner;
class LogicalCalculator 
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
			boolean operand1 = sc.nextBoolean();
			System.out.print("Enter operand2 : ");
			boolean operand2 = sc.nextBoolean();
			System.out.print("Enter an operator : ");
			String operator = sc.next();
			boolean output = false;
			switch(operator)
			{
				case "&&" : output = operand1 && operand2 ; break;
				case "||" : output = operand1 || operand2 ; break;
				case "#" : break outerloop;
				default : System.out.println("Wrong operator "); break;
			}
			System.out.println("Output is :" + output);
		}
	}
}