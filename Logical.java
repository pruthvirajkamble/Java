class Logical 
{
	public static void main(String[] args) 
	{
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(!true);
		System.out.println(true && 0==0);
		System.out.println(10%2==0 && 10%2!=1);
		System.out.println('a'<'1'&& true);
		System.out.println(0=='0' || 0!='0');
		System.out.println((!true) || (!false));
		System.out.println(1.0==1.0f && 3.14==3.14f);
		System.out.println(1.0==1.0f || 3.14==3.14f);
		System.out.println(true && !(false==true));
		//boolean ans = 3.14==3.14f?true:false;
		//System.out.println(ans);
		
	}
}
