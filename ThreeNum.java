class ThreeNum 
{
	public static void main(String[] args) 
	{
		int n1 = 120000;
		int n2 = 1900;
		int n3 = 200;
		//int ans1 = n1>n2?n1:n2;
		//int ans2 = n2>n3?n2:n3;
		//int ans = ans1>ans2?ans1:ans2;
		//int ans = n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
		//int ans = n2>n3?(n2>n1?n2:n1):(n3>n1?n3:n1);
		//int ans = n1>(n2>n3?n2:n3)?n1:(n2>n3?n2:n3);
		int ans = (n1>n2?n1:n3)>n3?(n1>n2?n1:n2):n3;
		
		
		System.out.println(ans);
	}
}
