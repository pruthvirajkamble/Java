interface Parent1
{
     default void m1(){
     	System.out.println("Parent 1");
     }
}
interface Parent2
{
     default void m1(){
     	System.out.println("Parent 2");
     }
}
interface Child extends Parent1,Parent2
{
	 default void m1(){
	 	System.out.println("Child");
	 	Parent1.super.m1();
	 	Parent2.super.m1();
	 }
}
class Demo implements Child{
	
}
class InterfaceExample
{
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.m1();
	}
}