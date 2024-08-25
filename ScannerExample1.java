import java.util.Scanner;
class ScannerExample1 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Type the byte: ");
		byte a = obj.nextByte();
		System.out.println("byte "+ a);
		System.out.print("Type the int : ");
		short b = obj.nextShort();
		System.out.println("short "+ b);
		System.out.print("Type the short : ");
		int c = obj.nextInt();
		System.out.println("int "+ c);
		System.out.print("Type the float : ");
		float d = obj.nextFloat();
		System.out.println("float "+ d);
		System.out.print("Type the long : ");
		long e = obj.nextLong();
		System.out.println("Long "+ e);
		System.out.print("Type the double : ");
		double f = obj.nextDouble();
		System.out.println("double "+ f);
		System.out.print("Type the Boolean : ");
		boolean g = obj.nextBoolean();
		System.out.println("boolean "+ g);
	}
}
