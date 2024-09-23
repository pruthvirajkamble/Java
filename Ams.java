class Ams
{
	public static void main(String[] args) {
		int num =153;
		int dup = num;
		int count =0;
		int sum =0;
		
		for(int i=num;i>0;i/=10)
			count++; 
		while(num>0){
			int rem = num%10; 
			int pow = 1; 
			for(int i=1;i<=count;i++)
				pow *= rem; 
			sum += pow ; 
			num/=10; 
		}
		System.out.println((sum==dup)?dup+" is Armstrong ":dup +" is not Armstrong");
	}
}