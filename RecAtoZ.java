class RecAtoZ
{
	public static void main(String[] args) 
	{
		alpha();
	}
	public static void alpha() 
	{
		for (char n1='a'; n1>='z';n1++) 
			System.out.println(n1);
		alpha();
	}
}