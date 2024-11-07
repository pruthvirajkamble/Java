class NonStatic
{
	public static void main(String[] args) {
		
	}
	void m3()
	{
      System.out.println("m3()");
	}
}
class Example22
{   NonStatic obj = new NonStatic();
    Static  v1 = obj.m3();
	public static void m1() {
		
		Example22.v1;
		Example22 obj1 = new Example22();
		obj.m2();
	}
	public void m2(){
		Example.v1;
      
	}
}