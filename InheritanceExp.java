class Vehicle {
    String brand;   
    String model;       
    int speed;       
    String fuelType;    
    int capacity;       

    public Vehicle(String brand, String model, int speed, String fuelType, int capacity) {
        super();
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.fuelType = fuelType;
        this.capacity = capacity;
    }

    public void drive() {
        System.out.println(brand + " " + model + " is driving at " + speed + " km/h.");
    }

    // Getters and Setters
}
class Car extends Vehicle {
    boolean hasSunroof;    
    String transmissionType; 
    boolean isElectric;    
    int numberOfDoors;
    String carType;        

    //String brand, String model, int speed, String fuelType, int capacity
    Car(String brand, String model, int speed, String fuelType, int capacity, 
               boolean hasSunroof, String transmissionType, boolean isElectric, 
               int numberOfDoors, String carType) 
    {
        super(brand, model, speed, fuelType, capacity);
        this.hasSunroof = hasSunroof;
        this.transmissionType = transmissionType;
        this.isElectric = isElectric;
        this.numberOfDoors = numberOfDoors;
        this.carType = carType;
    }

    // Additional behavior specific to the Car class
    public void displayCarDetails() {
        System.out.println("This " + brand + " " + model + " is a " + carType + " with " + numberOfDoors + " doors.");
    }


}
class InheritanceExp{
    public static void main(String[] args) {
        //String brand, String model, int speed, String fuelType, int capacity, 
              // boolean hasSunroof, String transmissionType, boolean isElectric, 
              // int numberOfDoors, String carType
        Car obj = new Car("Tesla", "Model S", 240, "Electric", 5, true, "Automatic", true, 4, "Sedan");
        obj.drive();
        obj.displayCarDetails();

    }
}