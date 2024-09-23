class Pattern5
{
	public static void main(String[] args) {
		int num = 0;
		for(int i=1;i<=6;i++){
			num = i+num;
			int b = num;
			for(int j=1;j<=i;j++){
				System.out.print(num-- + " ");
			}
			num = b;
			System.out.println();
		}
	}
}