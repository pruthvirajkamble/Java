
class sqrt
{
	public static void main(String[] args) {
	     sqrt(16);
	}
	public static int sqrt(int num)
	{
		int sqrt1 = 0;
		for(int i=1;i<num/3;i++)
		{
			if(i*i==num){
				sqrt1 = i;
				break;
			}
			
		}
		if(sqrt1 != 0)
		 {
				System.out.println("square root is "+ sqrt1);
		 }
		 else
		 {
				System.out.println("it is not a square root "+ sqrt1);
		  }
		return sqrt1;
	}
}