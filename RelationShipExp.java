class Car{
	String Brand;
	String Model;
	String type;
	String color;
	int capacity;
	//Engine engine = new Engine("SI", 180,2100,4,13);
	//2 Engine engine; // null
	Engine engine; // null

	//3 Car(String Brand, String Model, String type, String color, int capacity,Engine engine) 
	Car(String Brand, String Model, String type, String color, int capacity){
		super();
		this.Brand = Brand;
		this.Model = Model;
		this.type = type;
		this.color = color;
		this.capacity = capacity;
		//this.engine = engine;
		this.engine = new Engine("cng",124,12,10,120);
	}
	public void CarDisplay(){
		System.out.println();
		System.out.println("Brand Name : "+ this.Brand);
		System.out.println("Model : "+ this.Model);
		System.out.println("Type of Car : "+ this.type);
		System.out.println("Color of car : "+ this.color);
		System.out.println("capacity : "+ this.capacity);
	}

}
class Engine{
	String typeEngine;
	double bhp;
	double cc;
	int nopiston;
	double mileage;
 
	Engine(String typeEngine, double bhp, double cc, int nopiston, double mileage){
		super();
		this.typeEngine = typeEngine;
		this.bhp = bhp;
		this.cc = cc;
		this.nopiston = nopiston;
		this.mileage = mileage;
	}

	public void diplayEngine(){
		System.out.println();
		System.out.println("type of engine : "+ this.typeEngine);
		System.out.println("Break horsh power : "+ this.bhp);
		System.out.println("how much cc : "+ this.cc);
		System.out.println("number of piston : "+ this.nopiston);
		System.out.println("mileage : "+ this.mileage);
	}

}

class RelationShipExp
{
	public static void main(String[] args) {
		//String Brand, String Model, String type, String color, int capacity
		Car car = new Car("TATA","nexon","xuv","black",5);
		car.CarDisplay();
		car.engine.diplayEngine();	
	}
}