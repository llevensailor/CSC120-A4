public class Engine {
    //Attributes
    private FuelType f;
    private double currentFuelLevel; 
    private double maxFuelLevel; 
    public Engine(FuelType f,  double maxFuelLevel)
    {   this.f = f;
    this.currentFuelLevel = maxFuelLevel;
    this.maxFuelLevel = maxFuelLevel; 
    }
    //Accessors 
    public double getCurrentFuelLevel() {
    return currentFuelLevel;
    }
    public double getMaxFuelLevel() {
    return maxFuelLevel;
    }
    public FuelType getF() {
    return f;
    }

    public void refuel()
    { 
    currentFuelLevel = maxFuelLevel; 
    }

    public boolean go() { 
    currentFuelLevel -= 10; 
    System.out.println("Current fuel level is " + currentFuelLevel);
    if(currentFuelLevel > 0 )
    { return true; }
    else 
        return false; 
    }

    public static void main(String[] args) {
    Engine myEngine = new Engine(FuelType.ELECTRIC,  100.0);
    while (myEngine.go()) {
        System.out.println("Choo choo!");
    }
    System.out.println("Out of fuel.");
    }














}