abstract class Vehicle {
    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void serviceInfo() {
        System.out.println("Regular servicing is recommended every 10,000 miles.");
    }
}

class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the engine of the " + make + " " + model + ".");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the engine of the " + make + " " + model + ".");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");
        myCar.startEngine();
        myCar.stopEngine();
        myCar.serviceInfo();
    }
}
