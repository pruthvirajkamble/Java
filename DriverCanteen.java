class Canteen
{
	int price;
	String foodcategory;
	String fooditems;

	Canteen (int price,String foodcategory,String fooditems)
	{
		super();
		this.price = price;
		this.foodcategory = foodcategory;
		this.fooditems = fooditems;
	}
	void displayCanteen()
	{
		System.out.println("Order Details");
		System.out.println("Price : "+price);
		System.out.println("Food Category : "+foodcategory);
		System.out.println("Food Items : "+fooditems);
	}
}
	
class DriverCanteen
{
	public static void main(String[] args) 
	{
		Canteen obj = new Canteen(100,"Veg","Dosa");
		obj.displayCanteen(); 
	}
}