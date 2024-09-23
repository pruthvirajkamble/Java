class FashinetingNumber
{
	public static void main(String[] args) {
		int num = 327;
		String op = ""+num+(num*2)+(num*3);
		boolean flag = true;

		for(char i='1';i<'9';i++){
			int count =0;
			for(int j=0;j<op.length();j++){
				char ch = op.charAt(j);
				if(i==ch){
					count++;
				}
			}
			if(!(count==1)){
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println(num + " It is fashineting Number. ");
		}else{
			System.out.println(num + " It not a fashineting Number ");
		}
	}
}