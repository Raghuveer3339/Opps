public class CarDemo {
    private String make;
    private String model;
    private int year;

    public CarDemo(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayCarDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    public static void main(String[] args) {
        CarDemo myCar = new CarDemo("Tesla", "Model 3", 2025);
        myCar.displayCarDetails();
    }
}
