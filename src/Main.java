abstract class Vehicle {

    private String vehicleOwner;
    private String vehicleType;
    private String vehicleNumber;

    static int totalVehicles = 0;

    final String COMPANY = "TATA";

    public Vehicle(String owner, String type, String number) {

        this.vehicleOwner = owner;
        this.vehicleType = type;
        this.vehicleNumber = number;

        totalVehicles++;
    }

    public String getVehicleOwner() {
        return vehicleOwner;
    }

    public void setVehicleOwner(String vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    abstract void start();

    abstract double calculateServiceCost();

    abstract float calculateSpeed();
}

class Car extends Vehicle {

    public Car(String owner, String type, String number) {
        super(owner, type, number);
    }

    @Override
    void start() {
        System.out.println("Car starts with push button");
    }

    @Override
    double calculateServiceCost() {
        return 5000;
    }

    @Override
    float calculateSpeed() {
        return 120.5f;
    }
}

class Bike extends Vehicle {

    public Bike(String owner, String type, String number) {
        super(owner, type, number);
    }

    @Override
    void start() {
        System.out.println("Bike starts with self start");
    }

    @Override
    double calculateServiceCost() {
        return 2000;
    }

    @Override
    float calculateSpeed() {
        return 80.0f;
    }
}

class Truck extends Vehicle {

    public Truck(String owner, String type, String number) {
        super(owner, type, number);
    }

    @Override
    void start() {
        System.out.println("Truck starts with heavy engine");
    }

    @Override
    double calculateServiceCost() {
        return 8000;
    }

    @Override
    float calculateSpeed() {
        return 90.0f;
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Car("John", "Sedan", "ABC123");

        Vehicle v2 = new Bike("Alice", "Sports", "XYZ789");

        Vehicle v3 = new Truck("Bob", "Cargo", "LMN456");

        v1.start();
        System.out.println(v1.calculateServiceCost());
        System.out.println(v1.calculateSpeed());

        v2.start();
        System.out.println(v2.calculateServiceCost());
        System.out.println(v2.calculateSpeed());

        v3.start();
        System.out.println(v3.calculateServiceCost());
        System.out.println(v3.calculateSpeed());

        System.out.println("Total Vehicles: " + Vehicle.totalVehicles);
    }
}