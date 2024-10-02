import java.util.ArrayList;

public class Train {

    //Attributes
    Engine engine; 
    ArrayList<Car> cars; 
    private int maxCars; 
    
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        engine = new Engine(fuelType, fuelCapacity);
        cars = new ArrayList<>(nCars); 
        Car car = new Car(passengerCapacity);
        
    }

    public Engine getEngine() {
        return engine; 
    }
    public Car getCar(int i){ 
        return cars.get(i - 1); 
    }

    public int getMaxCapacity(){
        return maxCars; 
    }

    public int seatsRemaining(){
        int totalSeats = 0; 
        for (Car c : cars)
        { totalSeats += c.seatsRemaining(); }
        return totalSeats; 
    }

    public void printManifest(){ 
        for (Car c : cars)
        { c.printManifest(); }
        
    }

    

}
