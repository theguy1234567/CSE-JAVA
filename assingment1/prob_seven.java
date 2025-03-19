
// Design a vehicle class hierarchy in Java, and develop a program to demonstrate Polymorphism. 

abstract class Vehicle{
    abstract void move();
}

class Car extends Vehicle{
    @Override
    void move(){
        System.out.println("The car has started moving");
    }
}
class Bike extends Vehicle{
    @Override
    void move(){
        System.out.println("the Bike has stated moving");
    }
}
class Truck extends Vehicle{
    @Override
    void move(){
        System.out.println("the truck has stated moving");

    }
}
public class prob_seven {
    public static void main(String[] args) {
        Vehicle myVehicle;
        myVehicle = new Car();
        myVehicle.move();
        myVehicle = new Bike();
        myVehicle.move();
        myVehicle = new Truck();
        myVehicle.move();


    }
    
}
