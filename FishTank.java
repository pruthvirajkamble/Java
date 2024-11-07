class Fish {
     String species;        // Type of fish (e.g., Goldfish, Guppy)
     String color;          // Color of the fish
     int size;              // Size in centimeters
     boolean isFreshWater;  // True if freshwater fish
     int age;               // Age of the fish in years

     Fish(String species, String color, int size, boolean isFreshWater, int age) 
     {  
     	super();
        this.species = species;
        this.color = color;
        this.size = size;
        this.isFreshWater = isFreshWater;
        this.age = age;
    }
}
class FishTank{
	double capacity;       // Capacity of the tank in liters
    String material;       // Material of the tank (e.g., Glass, Acrylic)
    String shape;          // Shape of the tank (e.g., Rectangle, Cube)
    String filterType;     // Type of filter used in the tank
    int numOfFish;         // Number of fish in the tank
    FishTank(double capacity, String material, String shape, String filterType, int numOfFish) 
    {   
    	super();
        this.capacity = capacity;
        this.material = material;
        this.shape = shape;
        this.filterType = filterType;
        this.numOfFish = numOfFish;
    }
}
class Water {
     double temperature;    // Water temperature in Celsius
     double pHLevel;        // pH level of the water
     boolean isFreshWater;  // True if freshwater
     int hardness;          // Water hardness level
     double salinity;       // Salinity level (for saltwater tanks)
     Water(double temperature, double pHLevel, boolean isFreshWater, int hardness, double salinity) 
     {  
     	super();
        this.temperature = temperature;
        this.pHLevel = pHLevel;
        this.isFreshWater = isFreshWater;
        this.hardness = hardness;
        this.salinity = salinity;
    }
 }
 class FishFood {
    String type;           // Type of food (e.g., Flakes, Pellets, Live food)
    int quantity;          // Quantity of food in grams
    String brand;          // Brand of the fish food
    boolean isOrganic;     // True if the food is organic
    String expirationDate; // Expiration date of the food
    FishFood(String type, int quantity, String brand, boolean isOrganic, String expirationDate) 
    {
    	super();
        this.type = type;
        this.quantity = quantity;
        this.brand = brand;
        this.isOrganic = isOrganic;
        this.expirationDate = expirationDate;
    }
}
class Plant {
    String species;        // Type of plant (e.g., Java Fern, Anubias)
    double height;         // Height of the plant in cm
    boolean isAquatic;     // True if the plant is fully aquatic
    String growthRate;     // Growth rate (e.g., Fast, Slow)
    int age;               // Age of the plant in months
    Plant(String species, double height, boolean isAquatic, String growthRate, int age) 
    {
    	super();
        this.species = species;
        this.height = height;
        this.isAquatic = isAquatic;
        this.growthRate = growthRate;
        this.age = age;
    }
}
class Stone {
    String type;           // Type of stone (e.g., River Rock, Gravel)
    String color;          // Color of the stone
    double weight;         // Weight of the stone (in grams)
    String texture;        // Texture of the stone (e.g., smooth, rough)
    double size;           // Size of the stone (in cm)
    Stone(String type, String color, double weight, String texture, double size) 
    {
    	super();
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.texture = texture;
        this.size = size;
    }
}
class Light {
    String type;           // Type of light (e.g., LED, Fluorescent)
    int wattage;           // Wattage of the light (in watts)
    String colorTemperature; // Color temperature (e.g., Cool White, Warm White)
    boolean isDimmable;    // Whether the light is dimmable
    int lifespan;          // Lifespan of the light (in hours)
    Light(String type, int wattage, String colorTemperature, boolean isDimmable, int lifespan) 
    {
    	super();
        this.type = type;
        this.wattage = wattage;
        this.colorTemperature = colorTemperature;
        this.isDimmable = isDimmable;
        this.lifespan = lifespan;
    }
}
class Filter {
    String brand;          // Brand of the filter
    int capacity;          // Capacity of the filter (in liters)
    String filterType;     // Type of filter (e.g., Mechanical, Biological, Chemical)
    int flowRate;          // Flow rate of the filter (in liters per hour)
    boolean isPowerSaving; // Whether the filter is power-saving
    Filter(String brand, int capacity, String filterType, int flowRate, boolean isPowerSaving) 
    {
    	super();
        this.brand = brand;
        this.capacity = capacity;
        this.filterType = filterType;
        this.flowRate = flowRate;
        this.isPowerSaving = isPowerSaving;
    }
}
class DriveFishTank{
	public static void main(String[] args) {
		
	}
}