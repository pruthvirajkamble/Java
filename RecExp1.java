class RecExp1
{   static int num = 100;
	public static void main(String[] args) {
		printNumber();
	}
	public static void printNumber() {
		System.out.print(num-- + " ");
		if(num==49)
			return;
		printNumber();
	}
}