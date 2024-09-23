class printNumber
{
	public static void main(String[] args) {
		m1(1);
	}
	public static void m1(int num)
	{
		System.out.println(num++);
		if(num==11)
			return;
		m1(num);
	}
}