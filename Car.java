import java.util.ArrayList;

public class Car {
    //Attributes
    ArrayList<Passenger> passengersOnboard; 
    private int maxCapacity; 

    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity; 
        passengersOnboard = new ArrayList<>(maxCapacity); 
        
        
    }

    public int getCapacity() {
        return maxCapacity;
    }

    public int seatsRemaining() {
        int seats = maxCapacity - passengersOnboard.size();
        return seats; 
    }

    public boolean addPassenger(Passenger p) { 
        if (seatsRemaining() > 0)
        { 
        passengersOnboard.add(p); 
        return true; }
        else 
        
        return false; 

    }

    public boolean removePassenger(Passenger p) {
        if(passengersOnboard.contains(p))
        { passengersOnboard.remove(p); 
            
        return true;}
        else 
          
        return false; 
    }

    public void printManifest() {
        if (passengersOnboard.size() != 0)
        { for(Passenger p : passengersOnboard)
        { System.out.println(p.getName());} }
        else {
            System.out.println("This car is EMPTY");
        }
    }

public static void main(String[] args) {
    Passenger Jill = new Passenger("Jill");
    Passenger George = new Passenger("George");
    Car myCar = new Car(10); 
    myCar.addPassenger(Jill);
    myCar.addPassenger(George);
    myCar.printManifest();
    myCar.removePassenger(George);
    myCar.printManifest(); 
}


}