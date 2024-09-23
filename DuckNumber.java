import java.util.Scanner;
class DuckNumber
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :");
	String num = sc.next();
	boolean flag = false;
	if(!(num.charAt(0)=='0')){
		for(int i=1;i<num.length();i++){
			if(num.charAt(i)=='0'){
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println(num + " is DuckNumber");
		}else{
			System.out.println(num+" is not a DuckNumber.");
		}
	}else{
		System.out.println(num+" is not a DuckNumber.");
	}
	}
	
}