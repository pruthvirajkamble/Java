class RecAtoZ
{   
	static char ch = 'A';
	public static void main(String[] args) 
	{
		letter();
	}
	public static void letter()
	{
       
		System.out.println(ch++ + " ");
		if(ch=='Z')
			return;
		letter();

	}

}