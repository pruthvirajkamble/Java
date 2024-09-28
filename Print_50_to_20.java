class Print_50_to_20
{
	public static void main(String[] args) {
		number(50);
	}
	public static int number(int num)
	{
		System.out.print(num-- + " ");
		if(num>=20)
		number(num);
	return num;
	}

}