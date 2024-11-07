interface Vehicle{
	void seatingCapacity();
	void price();
	void mileage();
	void brand();
}
interface Car extends Vehicle
{
	void airBags();
	void  autoPilot();
}
interface Bike extends Vehicle
{
	void engineCapacity();
	void typeBike();
}
class ImpCar implements Car
{
	
	
	public void seatingCapacity(){
		System.out.println("seat Capacity: 4 seats");
	}
	public void price(){
		System.out.println("Price of a car : 1000000lac");
	}
	public void mileage(){
		System.out.println("mileage of a car : 25km/h");
	}
	public void brand(){
		System.out.println("brand of car : TATA");
	}
	public void airBags(){
		System.out.println("airbags in a car : 2");
	}
	public void  autoPilot(){
		System.out.println("autoPilot : true");
	}	
}

class ImpBike implements Bike
{

	
	public void seatingCapacity(){
		System.out.println("Seating Capacity : 2");
	}
	public void price(){
		System.out.println("price : 200000");
	}
	public void mileage(){
		System.out.println("mileage : 60km/h");
	}
	public void brand(){
		System.out.println("brand : hero");
	}
	public void engineCapacity(){
		System.out.println("cc : 110CC");
	}
	public void typeBike(){
		System.out.println("type of bike: simple");
	}	
}

class InterfaceDriver{
	public static void main(String[] args) 
	{
		ImpCar obj = new ImpCar();
		obj.seatingCapacity();
		obj.price();
		obj.brand();
		obj.mileage();
		obj.airBags();
		obj.autoPilot();

		ImpBike obj1 = new ImpBike();
		obj1.seatingCapacity();
		obj1.price();
		obj1.brand();
		obj1.mileage();
		obj1.engineCapacity();
		obj1.typeBike();
	}
}